package com.example.demo.backgohost.controller;

import com.example.demo.backgohost.dto.AdminRecordDto;
import com.example.demo.backgohost.dto.ClientRecordDto;
import com.example.demo.backgohost.model.AdminModel;
import com.example.demo.backgohost.model.ClientModel;
import com.example.demo.backgohost.repository.AdminRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    AdminRepository adminRepository;

    @GetMapping
    public ResponseEntity<List<AdminModel>> getAdmin() {
        return ResponseEntity.status(HttpStatus.OK).body(adminRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<AdminModel> createAdmin(@RequestBody AdminRecordDto adminRecordDto) {
        AdminModel adminModel = new AdminModel();
        BeanUtils.copyProperties(adminRecordDto, adminModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(adminRepository.save(adminModel));
    }

}
