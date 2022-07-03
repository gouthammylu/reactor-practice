package com.practice;

import reactor.core.publisher.Mono;

public class Lec02MonoJust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mono<Integer> mono=Mono.just("ball")
								.map(o->o.length())
								.map(l->l/0);
		mono.subscribe(Utils.onNext(),
						Utils.onError(),
						Utils.onComplete());

	}

}
