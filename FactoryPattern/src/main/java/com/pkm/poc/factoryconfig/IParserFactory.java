/**
 * 
 */
package com.pkm.poc.factoryconfig;

import com.pkm.poc.factorybean.IParser;

/**
 * @author pkumar
 *
 */
public interface  IParserFactory {
	 public IParser getParser(String strategyName);
}


