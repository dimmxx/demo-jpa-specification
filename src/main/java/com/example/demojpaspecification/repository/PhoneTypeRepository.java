package com.example.demojpaspecification.repository;

import com.example.demojpaspecification.model.PhoneType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneTypeRepository extends JpaRepository<PhoneType, Long> {
}
