package com.javatechie.api.bank.service.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import com.javatechie.api.bank.service.api.Payment;
import javax.annotation.Resource;

@Component
@PropertySource(value= {"classpath:application.properties"})
public class UserPaymentService {
	
	@Autowired
	@Qualifier("paytm")
	//@Res
	private Payment payment;
	
	public String processPayment() {
		return payment.doTransaction();
	}

}
