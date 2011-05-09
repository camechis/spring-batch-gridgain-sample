package com.camechis.sample.batch.gridgain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class SampleItemReader implements org.springframework.batch.item.ItemReader<String> {

	List<String> items = new ArrayList<String>();
	
	public SampleItemReader( ) {
		items.add("Foo");
		items.add("Bar");
		items.add("Yo");
		items.add("Dude");
		items.add("WTF");
		items.add("LOL");
	}
	
	
	@Override
	public String read() throws Exception, UnexpectedInputException,
			ParseException, NonTransientResourceException {

		if( ! items.isEmpty() ) {
			return items.remove(0);
		} else { 
			return null;
		}
		
	}

	
	
	
	
}
