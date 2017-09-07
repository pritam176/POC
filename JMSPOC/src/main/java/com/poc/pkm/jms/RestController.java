package com.poc.pkm.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/transaction")
public class RestController {

	@Autowired
	private JmsTemplate jmsTemplate;

	@PostMapping("/send")
	public void send(@RequestBody OrderTransaction transaction) {
		System.out.println("Sending a transaction.");
		// Post message to the message queue named "OrderTransactionQueue"
		jmsTemplate.convertAndSend("OrderTransactionQueue", transaction);
	}
	
	@RequestMapping(value="xml",produces=MediaType.APPLICATION_XML_VALUE)
	public String sendXML() {
		System.out.println("Sending a transaction.");
		OrderTransaction transaction =new OrderTransaction();
		transaction.setId("c");
		transaction.setId("a");
		String fname ="Pritam";
		String lastName ="Kumar";
		String emailAddress ="pkumar@tacme.net";
		String telephoneNumber ="0565770929";
		String country ="India";
		String details ="JSON CREATION FROM DINAMIC";
		
		
		
		String input = "{\"firstName\":"+"\""+fname+"\""+",\"lastName\":"+"\""+lastName+"\""+
		",\"emailAddress\":"+"\""+emailAddress+"\""+",\"telephoneNumber\":"+"\""+telephoneNumber+"\""+",\"country\":"+"\""+country+"\""+",\"details\":"+"\""+details+"\""+"}";
		
		return input;
		
	}

}
