package edu.wctc.fullstack.service;

import edu.wctc.fullstack.model.Client;
import edu.wctc.fullstack.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients(){
        List<Client> list = new ArrayList<>();
        clientRepository.findAll().forEach(list::add);
        return list;
    }

    public Client save(Client client){
        return clientRepository.save(client);
    }

}
