package com.practice.custom;

import java.util.function.Consumer;

import com.practice.Utils;

import reactor.core.publisher.Flux;

public class Lec01FluxCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flux.create(fluxSink->{
			
			for(int i=0;i<10;i++) {
				
				fluxSink.next(Utils.faker().country().name());
				
			}
			
		}).subscribe(Utils.subscriber());
		

		
		
	}

}
