package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Payment;
import com.example.demo.service.PaymentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api/payment/")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("{userId}")
    public ResponseEntity<Payment> createPayment(@RequestBody Payment payment, @PathVariable("userId") int userId) {  // Remove PaymentId from method signature
       System.out.println(payment);
       System.out.println(userId);
    	return new ResponseEntity<Payment>(paymentService.addPayment(payment,userId), HttpStatus.CREATED);
    }

    // Getting list of payments
    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    // Get payment by payment ID (for receipt)
    @GetMapping("{paymentId}")
    public ResponseEntity<Payment> getPaymentById(@PathVariable long paymentId) {
        return new ResponseEntity<>(paymentService.getPaymentById(paymentId), HttpStatus.OK);
    }

    // To delete payment
    @DeleteMapping("{hId}")
    public ResponseEntity<Boolean> deletePayment(@PathVariable int hId) {
        paymentService.deletePayment(hId);
        boolean flag = true;
        return new ResponseEntity<>(flag, HttpStatus.OK);
    }
}
