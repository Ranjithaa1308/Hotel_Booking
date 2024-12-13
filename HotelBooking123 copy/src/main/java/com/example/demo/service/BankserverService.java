package com.example.demo.service;

import java.util.Date;

import com.example.demo.model.Bankserver;

public interface BankserverService {
	Bankserver saveDetails(Bankserver bankserver);
	Bankserver findByCardCvv(Long cCardnumber, String nameoncard, String expyear, int cvv);
	Bankserver findByUpi(String cUpi);
}