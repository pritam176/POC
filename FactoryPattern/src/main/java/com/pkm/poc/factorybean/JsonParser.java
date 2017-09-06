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
public class JsonParser implements IParser {

	@Override
	public String parse(String str) {
		 System.out.println("JsonParser.parse::" + str);
		return "JsonParser.parse::" + str;
		
	}

}
