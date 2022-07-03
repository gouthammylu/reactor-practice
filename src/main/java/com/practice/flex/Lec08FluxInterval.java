package com.practice.flex;

import java.time.Duration;

import com.practice.Utils;

import reactor.core.publisher.Flux;

public class Lec08FluxInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flux.interval(Duration.ofSeconds(1))
			.subscribe(Utils.onNext());
		
		Utils.delaySeconds(6000);

	}

}
