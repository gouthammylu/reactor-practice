package com.practice.flex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.practice.Utils;

import reactor.core.publisher.Flux;

public class Lec04FromStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		Stream<Integer> stream=list.stream();
		
		//Flux<Integer> fromFluxStream = Flux.fromStream(stream);

		Flux<Integer> fromFluxStream = Flux.fromStream(()->list.stream());
		
		fromFluxStream.subscribe(Utils.onNext(),Utils.onError(),Utils.onComplete());
		
		fromFluxStream.subscribe(Utils.onNext(),Utils.onError(),Utils.onComplete());

	}

}
