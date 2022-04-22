package com.example.greetingservice.repository;

import com.example.greetingservice.entity.PersonRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRecordRepository  extends JpaRepository<PersonRecordEntity, Integer> {
    Optional<PersonRecordEntity> findById(int integer);
}
