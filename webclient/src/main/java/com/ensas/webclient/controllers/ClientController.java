package com.ensas.webclient.controllers;

import com.ensas.webclient.models.UserForm;
import com.ensas.webclient.repository.ClientProxy;
import com.ensas.webclient.services.ClientService;
import mypackage.Creancier;
import mypackage.ResultImpaye;
import mypackage.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    ClientService clientService;

    @PostMapping("/login")
    public void login(@RequestBody UserForm userForm){
        clientService.login(userForm.getNum(), userForm.getPass());
    }

    @GetMapping("/solde")
    public double getSolde(){
        return clientService.getSolde();
    }

    @GetMapping("/listCreancier")
    public List<Creancier> getListCreancier(){
        return clientService.getListCreancier();
    }

    @GetMapping("/historique")
    public List<Transaction> getHistorique(){
        return clientService.getHistorique();
    }

    @GetMapping("/getImpayes/{codeCreancier}/{codeCreance}")
    public ResultImpaye getImpayes(@PathVariable("codeCreancier") final String codeCreancier, @PathVariable("codeCreance") final String codeCreance){
        return clientService.getImpayes(codeCreancier, codeCreance);
    }

    @GetMapping("/confirmePaye/{codeCreancier}/{codeImpaye}")
    public boolean confirmePaye(@PathVariable("codeCreancier") final String codeCreancier, @PathVariable("codeImpaye") final String codeImpaye){
        return clientService.confirmePay(codeCreancier, codeImpaye);
    }

    @PostMapping("/setPassword")
    public void setClientPassword(@RequestBody UserForm userForm){
        String password = userForm.getPass();
        clientService.setClientPassword(password);
    }


}


