package com.practice;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

import reactor.core.publisher.Mono;

public class Lec05MonoFromSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Mono<String> mono=Mono.fromSupplier(()->getName()); (or)
		
		Supplier<String> supplier=()->getName();
		
		Mono<String> mono=Mono.fromSupplier(supplier);
		
		mono.subscribe(Utils.onNext(),
						Utils.onError(),
						Utils.onComplete());
		// (or)
		
		Callable<String> callable=()->getName();
		
		Mono<String> monoCallable=Mono.fromCallable(callable);
		
		monoCallable.subscribe(Utils.onNext(),
						Utils.onError(),
						Utils.onComplete());
		

	}
	
	private static String getName() {
		
		return Utils.FAKER.name().firstName();
		
	}

}
