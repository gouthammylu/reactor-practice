package com.practice;

import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

public class Leo07Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getName();
		String name=getName().subscribeOn(Schedulers.boundedElastic()).block();
		System.out.println(name);
		getName();
		Utils.delaySeconds(5);

	}
	
	private static Mono<String> getName() {
		
		System.out.println("in getName method");
		
		return Mono.fromSupplier(()->{
			System.out.println("generating name");
			Utils.delaySeconds(3);
			return Utils.faker().name().fullName();
			
		});
		
		
	}

}
