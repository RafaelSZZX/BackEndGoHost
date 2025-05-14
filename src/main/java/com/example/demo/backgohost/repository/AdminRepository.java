package com.example.demo.backgohost.repository;

import com.example.demo.backgohost.model.AdminModel;
import com.example.demo.backgohost.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<AdminModel, Integer> {
    Optional<AdminModel> findById(int id);

    Optional<AdminModel> findAllById(int idA);
}
