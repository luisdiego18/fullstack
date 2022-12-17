package edu.wctc.fullstack.controller;

import edu.wctc.fullstack.service.ClientService;
import edu.wctc.fullstack.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/api/clients")
    public List<Client> getAllClients(){
        return clientService.getAllClients();
    }
}
