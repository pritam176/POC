/**
 * 
 */
package com.pkm.poc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pkm.poc.factorybean.IParser;
import com.pkm.poc.factoryconfig.IParserFactory;
import com.pkm.poc.factoryconfig.ParserType;



/**
 * @author pkumar
 *
 */
@Service
public class ParserService {

 @Autowired
 private IParserFactory parserFactory;

 public String doParse(String parseString, ParserType parseType) {
    IParser parser = parserFactory.getParser(parseType.getValue());
    System.out.println("ParserService.doParse.." + parser);
    return parser.parse(parseString);
 }
}