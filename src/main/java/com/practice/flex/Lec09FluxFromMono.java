package com.practice.flex;

import com.practice.Utils;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Lec09FluxFromMono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mono<String> just = Mono.just("goutham");
		
		Flux<String> from = Flux.from(just);
		
		from.subscribe(Utils.onNext());
		
		//Flux to Mono
		
		Flux.range(0, 10)
			.next()
			.subscribe(Utils.onNext(), Utils.onError(), Utils.onComplete());

	}

}
