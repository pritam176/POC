/**
 * 
 */
package com.poc.pkm.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author pkumar
 *
 */

@Component
public class JMSReciver {
	private int count = 1;

	@JmsListener(destination = "OrderTransactionQueue")
	public void receiveMessage(OrderTransaction transaction) {
		System.out.println("Received <" + transaction + ">");
		// transactionRepository.save(transaction);
		count++;
		System.out.println("count <" + transaction + ">");
		throw new RuntimeException("count-"+count);
	}

}
