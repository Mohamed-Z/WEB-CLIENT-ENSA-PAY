package com.ensas.webclient.services;

import com.ensas.webclient.repository.ClientProxy;
import mypackage.Creancier;
import mypackage.ResultImpaye;
import mypackage.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientProxy clientProxy;

    public Boolean login(String num, String pass){
        try {
            clientProxy.login(num,pass);
            System.out.println("connecté "+clientProxy.getIsActivated(num));
            return clientProxy.getIsActivated(num);
        } catch (Exception e){
            System.out.println("données incorrect");
            return null;
        }
    }

    public Double getSolde(){
        return clientProxy.getSolde();
    }

    public List<Transaction> getHistorique(){
        return clientProxy.getHistorique();
    }

    public List<Creancier> getListCreancier(){
        return clientProxy.getListCreancier();
    }

    public ResultImpaye getImpayes(String codeCreancier, String codeCreance){
        return clientProxy.getImpayes(codeCreancier, codeCreance);
    }

    public boolean confirmePay(String codeCreancier, String codeImpaye){
        return clientProxy.confirmePaye(codeCreancier, codeImpaye);
    }

    public void setClientPassword(String password){
        clientProxy.setClientPassword(password);
    }

}
