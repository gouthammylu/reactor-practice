package com.practice.flex;

import reactor.core.publisher.Flux;

public class Lec02MultipleSubscribers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flux<Integer> flux = Flux.just(1,2,3,4);
		
		Flux<Integer> filterFlux = flux.filter(i->i%2==0);
		
		flux.subscribe(i->System.out.println("sub1: "+i));
		filterFlux.subscribe(i->System.out.println("sub2: "+i));

	}

}
