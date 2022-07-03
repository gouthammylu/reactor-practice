package com.practice;

import reactor.core.publisher.Mono;

public class Lec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mono<Integer> mono=Mono.just(1);
		
		mono.subscribe();
		
		mono.subscribe(i->System.out.println("RECEIVED: "+i));
		
		mono.subscribe(i->System.out.println(i), 
					   err->System.out.println(err));
		mono.subscribe(i->System.out.println(i),
				err->System.out.println(err),
				()->System.out.println("COMPLETED"));

	}

}
