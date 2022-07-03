package com.practice.flex;

import com.practice.Utils;

import reactor.core.publisher.Flux;

public class NameGenerator {
	
	
	public static Flux<String> getNames(){
		
		return Flux.range(0, 5)
				.map(x->getName());
		
	}
	
	
	private static String getName() {
		
		Utils.delaySeconds(1000);
		
		return Utils.faker().name().fullName();
	}

}
