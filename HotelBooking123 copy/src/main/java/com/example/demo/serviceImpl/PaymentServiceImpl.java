package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Payment;
import com.example.demo.model.User;
import com.example.demo.repository.PaymentRepository;
import com.example.demo.service.UserService;
import com.example.demo.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentRepository paymentRepository;
	
	@Autowired
	private UserService userService;
	

	@Override
	public Payment addPayment(Payment payment,int userId) {
		User user = userService.getUserById(userId);
		payment.setUser(user);
		System.out.println(payment);
		return paymentRepository.save(payment);
	}

	@Override
	public List<Payment> getAllPayments() {
		return paymentRepository.findAll();
	}

	@Override
	public List<Payment> getAllPaymentsByRoomId(long roomId) {
	//	return paymentRepository.findByRoomId(roomId);
		return null;
	}

	@Override
	public void deletePayment(int hId) {
		paymentRepository.findById((long) hId);
		paymentRepository.deleteById((long) hId);

	}

	@Override
	public Payment getPaymentById(long paymentId) {
		// TODO Auto-generated method stub
		return null;
	}

}