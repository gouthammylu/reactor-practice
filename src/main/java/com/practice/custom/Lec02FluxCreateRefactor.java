package com.practice.custom;

import com.practice.Utils;

import reactor.core.publisher.Flux;

public class Lec02FluxCreateRefactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NameProducer nameProducer=new NameProducer();
		
		Flux.create(nameProducer).subscribe(Utils.subscriber());
		
		nameProducer.produce();

	}

}
