package com.assignment.task.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.assignment.task.entity.Payment;

public interface PaymentService {

    Payment savePayment(Payment payment);

    Payment getPaymentById(Long id);

    List<Payment> findAll();


    
}
