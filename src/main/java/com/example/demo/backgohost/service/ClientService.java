package com.example.demo.backgohost.service;

import com.example.demo.backgohost.model.AdminModel;
import com.example.demo.backgohost.model.ClientModel;
import com.example.demo.backgohost.repository.AdminRepository;
import com.example.demo.backgohost.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public ClientModel updateCliente(int id, ClientModel newClinetModel) {
        return clientRepository.findById(id)
                .map(clientModel -> {
                    clientModel.setNmUsuario(newClinetModel.getNmUsuario());
                    clientModel.setNuEmail(newClinetModel.getNuEmail());
                    // atualize outros campos conforme necessário
                    return clientRepository.save(clientModel);
                })
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }
}
