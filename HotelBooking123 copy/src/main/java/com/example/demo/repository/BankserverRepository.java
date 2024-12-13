package com.example.demo.repository;


import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Bankserver;

@Repository
public interface BankserverRepository  extends JpaRepository<Bankserver, Integer>{

	
	@Query(value = "select * from bankserver b where (b.c_cardnumber=?1) && (b.nameoncard=?2) && (b.expiry_date like ?3) &&(b.c_cvvnumber=?4)",nativeQuery = true)
	public Bankserver findByCardCvv(Long cCardnumber,String nameoncard, String expyear, int cvv);
	
	@Query(value = "select * from bankserver b where b.c_upi=?1",nativeQuery = true)
	public Bankserver findByUpi(String cUpi);
}