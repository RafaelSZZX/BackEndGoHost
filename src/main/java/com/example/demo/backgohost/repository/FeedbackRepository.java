package com.example.demo.backgohost.repository;

import com.example.demo.backgohost.model.FeedbackModel;
import com.example.demo.backgohost.model.ImovelModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FeedbackRepository extends JpaRepository<FeedbackModel, Integer> {

    Optional<FeedbackModel> findById(int id);

    Optional<FeedbackModel> findAllById(int id);
}
