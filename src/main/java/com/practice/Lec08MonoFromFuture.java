package com.practice;

import java.util.concurrent.CompletableFuture;

import reactor.core.publisher.Mono;

public class Lec08MonoFromFuture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mono.fromFuture(getName()).subscribe(Utils.onNext());
		
		Utils.delaySeconds(2000);

	}
	
	private static CompletableFuture<String> getName(){
		
		return CompletableFuture.supplyAsync(()->{
			
			return Utils.faker().name().fullName();
		});
	}

}
