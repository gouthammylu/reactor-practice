package com.practice.flex;

import com.practice.Utils;

import reactor.core.publisher.Flux;

public class Lec01Flex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Flux<Integer> flux = Flux.just(1,2,3);
		Flux<Object> flux = Flux.just(1,"Goutham",3);
		
		flux.subscribe(Utils.onNext(),Utils.onError(),Utils.onComplete());

	}

}
