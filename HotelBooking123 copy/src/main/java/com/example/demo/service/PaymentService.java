package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Payment;

public interface PaymentService {

	public Payment addPayment(Payment payment,int userId);
	public List<Payment> getAllPayments();
	public Payment getPaymentById(long paymentId);
	public void deletePayment(int hId);
	List<Payment> getAllPaymentsByRoomId(long roomId);
}