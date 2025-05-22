package com.example.demo.backgohost.repository;

import com.example.demo.backgohost.model.ImovelModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImovelRepository extends JpaRepository<ImovelModel, Integer> {
    Optional<ImovelModel> findById(int id);

    Optional<ImovelModel> findAllById(int id);
}
