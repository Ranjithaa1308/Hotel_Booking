package com.example.demo.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bankserver;
import com.example.demo.repository.BankserverRepository;
import com.example.demo.service.BankserverService;

@Service
public class BankserverServiceImpl implements BankserverService {

	
	@Autowired
	private BankserverRepository bankserverRepository;
	
	@Override
	public Bankserver saveDetails(Bankserver bankserver) {
		
		return bankserverRepository.save(bankserver);
	}
	@Override
	public Bankserver findByCardCvv(Long cCardnumber, String nameoncard, String expyear, int cvv) {
		return bankserverRepository. findByCardCvv(cCardnumber,nameoncard,expyear,cvv);
	}
	
	@Override
	public Bankserver findByUpi(String cUpi) {
		
		return bankserverRepository.findByUpi(cUpi);
	}
	

}

