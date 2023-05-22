package com.assignment.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.assignment.task.entity.Payment;
import com.assignment.task.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    PaymentRepository paymentRepository;

    
    @Override
    public Payment savePayment(Payment payment) {
        // TODO Auto-generated method stub
        return paymentRepository.save(payment);
    }


    @Override
    public Payment getPaymentById(Long id) {
        // TODO Auto-generated method stub
        return paymentRepository.getPaymentById(id);
    }


    @Override
    public List<Payment> findAll() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'findAll'");
        return paymentRepository.findAll();
    }





}
