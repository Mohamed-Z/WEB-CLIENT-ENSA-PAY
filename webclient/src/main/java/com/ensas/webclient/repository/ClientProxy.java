package com.ensas.webclient.repository;

import com.ensas.webclient.config.CustomProperties;
import lombok.extern.slf4j.Slf4j;
import mypackage.*;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.ServletWebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.util.*;

@Slf4j
@Component
public class ClientProxy {

    @Autowired
    CustomProperties props;

    CmiWebService proxy = new CmiWS().getCmiWebServicePort();

    public Client register(Client client){
        return proxy.updateClient(client);
    }

    public void login(String num,String password){
        String loginUrl = props.getApiUrl()+"/login";

        JSONObject clientJson = new JSONObject();
        clientJson.put("login",num);
        clientJson.put("password",password);
        HttpEntity<JSONObject> request = new HttpEntity<JSONObject>(clientJson);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Void> response = restTemplate.exchange(
                loginUrl,
                HttpMethod.POST,
                request,
                Void.class
        );
        String token = response.getHeaders().getFirst(HttpHeaders.AUTHORIZATION);
        System.out.println(token);
        HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        req.getSession().setAttribute("jwtToken",token);
        log.debug("Login call " + response.getStatusCode().toString());

    }

    public Double getSolde(){
        HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String token = (String) req.getSession().getAttribute("jwtToken");
        System.out.println("Session : "+token);
        /*ServletWebRequest servletWebRequest=new ServletWebRequest(req);
        HttpServletResponse res=servletWebRequest.getResponse();
        res.setHeader("Authorization",token);
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(token);
        Map<String, List<String>> headers2 = new HashMap<String, List<String>>();
        headers2.put("Authorization", Collections.singletonList("Bearer "+token));
        ((BindingProvider)proxy).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS,headers2);*/
        //JSONObject jtoken = new JSONObject();
        //jtoken.put("jwtToken","Bearer "+token);
        return proxy.getSolde("Bearer "+token);
    }

    public List<Creancier> getListCreancier(){
        return proxy.getListCreancier();
    }

    public boolean getIsActivated(String num){
        return  proxy.getIsActivated(num);
    }

    public List<Transaction> getHistorique(){
        HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String token = (String) req.getSession().getAttribute("jwtToken");
        System.out.println("Session : "+token);
        return proxy.getListTransaction("Bearer "+token);
    }

    public ResultImpaye getImpayes(String codeCreancier, String codeCreance){
        return proxy.getImpayes(codeCreancier, codeCreance);
    }

    public boolean confirmePaye(String codeCreancier, String codeImpaye){
        HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String token = (String) req.getSession().getAttribute("jwtToken");
        System.out.println("Session : "+token);
        return proxy.confirmePaye("Bearer "+token, codeCreancier, codeImpaye);
    }

    public void setClientPassword(String password){
        HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String token = (String) req.getSession().getAttribute("jwtToken");
        System.out.println("Session : "+token);
        proxy.setClientPassword("Bearer "+token, password);
    }

}
