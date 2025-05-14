package com.example.demo.backgohost.repository;

import com.example.demo.backgohost.model.AnfitriaoModel;
import com.example.demo.backgohost.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AnfitriaoRepository extends JpaRepository<AnfitriaoModel, Integer> {
    Optional<AnfitriaoModel> findById(int id);

    Optional<AnfitriaoModel> findAllById(int id);
}
