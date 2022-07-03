package com.practice.flex;

import com.practice.Utils;

import reactor.core.publisher.Flux;

public class Lec05RangeAndLog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flux.range(3, 10)
			.log()
			.map(x->Utils.faker().name().fullName())
			.log()
			.subscribe(Utils.onNext());
		

	}

}
