package com.example.demo.backgohost.controller;

import com.example.demo.backgohost.dto.ClientRecordDto;
import com.example.demo.backgohost.model.ClientModel;
import com.example.demo.backgohost.repository.ClientRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/cliente")
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @PostMapping
    public ResponseEntity<ClientModel> createClient(@RequestBody ClientRecordDto client) {
        ClientModel clientModel = new ClientModel();
        BeanUtils.copyProperties(client, clientModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(clientRepository.save(clientModel));
    }

    @GetMapping
    public ResponseEntity<List<ClientModel>> clientes() {
        return ResponseEntity.status(HttpStatus.OK).body(clientRepository.findAll());
    }


}
