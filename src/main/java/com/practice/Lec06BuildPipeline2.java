package com.practice;

import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

public class Lec06BuildPipeline2 {

	
	public static void main(String[] args) {
		
		
		getName();// "entered getname method" will ONLY be displayed and pipeline will be built
		getName().subscribeOn(Schedulers.boundedElastic()).subscribe(Utils.onNext());// "entered getname method" will be displayed and executes the pipeline
		getName();// "entered getname method" will ONLY be displayed and pipeline will be built
		
		Utils.delaySeconds(3000);
	}

	
	private static Mono<String> getName(){
		System.out.println("entered getname method");
		return Mono.fromSupplier(()->{
			System.out.println("generating name...");
			Utils.delaySeconds(1000);
			return Utils.faker().name().fullName();
		}).map(String::toUpperCase);
		
	}


}
