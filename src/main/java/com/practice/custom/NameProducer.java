package com.practice.custom;

import java.util.function.Consumer;

import com.practice.Utils;

import reactor.core.publisher.FluxSink;

public class NameProducer implements Consumer<FluxSink<String>> {

	private FluxSink<String> fluxSink;
	
	@Override
	public void accept(FluxSink<String> t) {
		// TODO Auto-generated method stub
		
		this.fluxSink=t;
		
	}
	
	public void produce() {
		String name=Utils.faker().name().fullName();
		this.fluxSink.next(name);
	}

}
