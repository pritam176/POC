/**
 * 
 */
package com.pkm.poc.factoryconfig;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.pkm.poc.factorybean.JsonParser;
import com.pkm.poc.factorybean.XMLParser;

/**
 * @author pkumar
 *
 */
@Configuration
public class ParserConfig {
	
	@Bean
	public FactoryBean<?> serviceLocatorFactoryBean() {
		ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
		factoryBean.setServiceLocatorInterface(IParserFactory.class);
		return factoryBean;
	}

	@Bean(name = "jsonParser")
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public JsonParser jsonParser() {
		return new JsonParser();
	}

	@Bean(name = "xmlParser")
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public XMLParser xmlParser() {
		return new XMLParser();
	}

}
