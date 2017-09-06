/**
 * 
 */
package com.pkm.poc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pkm.poc.factoryconfig.ParserType;
import com.pkm.poc.service.ParserService;

/**
 * @author pkumar
 *
 */
@RestController
public class RestContrioller {

	@Autowired
	ParserService parserService;

	@RequestMapping("testFactory")
	public String testFactory(@RequestParam String parser,@RequestParam String parseText) {
		System.out.println(ParserType.valueOf(parser));
		String res = parserService.doParse(parseText, ParserType.valueOf(parser));
		// parserService.doParse("", ParserType.XML);
		return res;
	}

}
