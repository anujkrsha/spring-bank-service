package com.javatechie.api.bank.service.api;

import org.springframework.stereotype.Service;

@Service
public class PhonePe implements Payment{

	public String doTransaction() {
		return "Payment Process using PhonePe..!";
	}

}
