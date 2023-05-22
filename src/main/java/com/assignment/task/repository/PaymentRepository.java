package com.assignment.task.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.assignment.task.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long> {

    Payment getPaymentById(Long id);

    
}
