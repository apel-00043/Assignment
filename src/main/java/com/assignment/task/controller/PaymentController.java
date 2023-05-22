package com.assignment.task.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.assignment.task.entity.Payment;
import com.assignment.task.repository.PaymentRepository;
import com.assignment.task.service.PaymentService;

@RestController
@RequestMapping("/api")
public class PaymentController {


    @Autowired
    PaymentService paymentService;

   @PostMapping("/payment")
   public Payment savePayment(@RequestBody Payment payment) {
    return paymentService.savePayment(payment);
    }

   @GetMapping("/payment/{id}")
   public Payment getPaymentById(@PathVariable("id") Long id) {
    return paymentService.getPaymentById(id);
   }


   @GetMapping("/payment/all")
   public List<Payment> fetchPaymentList() {
    return paymentService.findAll();
   }
   
}
