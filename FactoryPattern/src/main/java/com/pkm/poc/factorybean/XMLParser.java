/**
 * 
 */
package com.pkm.poc.factorybean;

import org.springframework.context.annotation.Configuration;

/**
 * @author pkumar
 *
 */
@Configuration
public class XMLParser implements IParser{

	@Override
	public String  parse(String str) {
		System.out.println("XMLParser.parse :: " + str);
		return "XMLParser.parse :: " + str;
		
	}

}
