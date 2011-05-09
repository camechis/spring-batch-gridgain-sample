package com.camechis.sample.batch.gridgain;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class SampleItemWriter implements ItemWriter<String>{

	@Override
	public void write(List<? extends String> arg0) throws Exception {
		for( String item : arg0 ) {
			System.out.println(item);
		}
	}

}
