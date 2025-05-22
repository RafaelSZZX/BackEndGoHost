package com.example.demo.backgohost.controller;

import com.example.demo.backgohost.dto.AnfitriaoRecordDto;
import com.example.demo.backgohost.dto.ClientRecordDto;
import com.example.demo.backgohost.dto.ImovelRecordDto;
import com.example.demo.backgohost.model.AnfitriaoModel;
import com.example.demo.backgohost.model.ClientModel;
import com.example.demo.backgohost.model.ImovelModel;
import com.example.demo.backgohost.repository.AnfitriaoRepository;
import com.example.demo.backgohost.repository.ImovelRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/anfitriao")
public class AnfitriaoController {

    @Autowired
    private AnfitriaoRepository anfitriaoRepository;

    @Autowired
    private ImovelRepository imovelRepository;

    @GetMapping
    public ResponseEntity<List<AnfitriaoModel>> getAnfitriao() {
        return ResponseEntity.status(HttpStatus.OK).body(anfitriaoRepository.findAll());
    }

    @GetMapping(value = "/imovel")
    public ResponseEntity<List<ImovelModel>> getAnfitriaoImovel() {
        return ResponseEntity.status(HttpStatus.OK).body(imovelRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<AnfitriaoModel> createAnfitriao(@RequestBody AnfitriaoRecordDto anfitriaoRecordDto) {
        AnfitriaoModel anfitriaoModel = new AnfitriaoModel();
        BeanUtils.copyProperties(anfitriaoRecordDto, anfitriaoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(anfitriaoRepository.save(anfitriaoModel));
    }

    @PostMapping(value = "/imovel")
    public ResponseEntity<ImovelModel> createImovel(@RequestBody ImovelRecordDto imovelRecordDto) {
        ImovelModel imovelModel = new ImovelModel();
        BeanUtils.copyProperties(imovelRecordDto, imovelModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(imovelRepository.save(imovelModel));
    }

}
