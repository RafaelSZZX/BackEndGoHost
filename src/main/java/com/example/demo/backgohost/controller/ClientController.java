package com.example.demo.backgohost.controller;


import com.example.demo.backgohost.dto.ClientRecordDto;
import com.example.demo.backgohost.dto.FeedbackRecordDto;
import com.example.demo.backgohost.model.ClientModel;
import com.example.demo.backgohost.model.FeedbackModel;
import com.example.demo.backgohost.repository.ClientRepository;
import com.example.demo.backgohost.service.ClientService;
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

    @Autowired
    private ClientService clientService;

    @PostMapping
    public ResponseEntity<ClientModel> createClient(@RequestBody ClientRecordDto client) {
        ClientModel clientModel = new ClientModel();
        BeanUtils.copyProperties(client, clientModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(clientRepository.save(clientModel));
    }

    @GetMapping
    public ResponseEntity<List<ClientModel>> getCliente() {
        return ResponseEntity.status(HttpStatus.OK).body(clientRepository.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClientModel> updateClient(@PathVariable int id, @RequestBody ClientModel clientModel) {
        try {
            ClientModel updatedUser = clientService.updateCliente(id, clientModel);
            return ResponseEntity.ok(updatedUser);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping("/feedback")
    public ResponseEntity<FeedbackModel> createClientFeedback(@RequestBody FeedbackRecordDto feedback) {
        FeedbackModel feedbackModel = new FeedbackModel();
        BeanUtils.copyProperties(feedback, feedbackModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(clientRepository.save(feedbackModel));
    }

}
