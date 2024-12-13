package com.example.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bankserver;
import com.example.demo.service.BankserverService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("api/bankserver")
	public class BankserverController  {

		
		@Autowired
		private BankserverService bankserverService;
		
		@PostMapping("/savebank")
		public Bankserver saveDetails(@RequestBody Bankserver bankserver) {
			return bankserverService.saveDetails(bankserver);
			
		}
		
		
		//find by card
		@GetMapping("/findbankdetails/{cardnum}/{nameoncard}/{expyear}/{cvv}")
		public Bankserver findByCardCvv(@PathVariable("cardnum") Long cCardnumber,@PathVariable("nameoncard") String nameoncard,@PathVariable("expyear") String expYear,@PathVariable("cvv") int cvv) {
		System.out.println(cCardnumber);	
		System.out.println(nameoncard);	
		System.out.println(expYear);	
		System.out.println(cvv);	
			return bankserverService.findByCardCvv(cCardnumber,nameoncard,expYear,cvv);
		
			
		}
		
		//find by upi
		@GetMapping("/findbyupi/{upi}")
		public Bankserver findByUpi(@PathVariable("upi") String cUpi) {
			return bankserverService.findByUpi(cUpi);
			
		}
		
	}
