package com.javatechie.api.bank.service.api;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
@Service
public class PhonePe implements Payment{

	public String doTransaction() {
		return "Payment Process using PhonePe..!";
	}

}
