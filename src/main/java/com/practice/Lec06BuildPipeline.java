package com.practice;

import reactor.core.publisher.Mono;

public class Lec06BuildPipeline {
	
	public static void main(String[] args) {
		
		
		getName();// "entered getname method" will ONLY be displayed and pipeline will be built
		getName();// "entered getname method" will ONLY be displayed and pipeline will be built
		getName();// "entered getname method" will ONLY be displayed and pipeline will be built
		
		getName().subscribe(Utils.onNext());// "entered getname method" will be displayed and executes the pipeline
		
	}

	
	private static Mono<String> getName(){
		System.out.println("entered getname method");
		return Mono.fromSupplier(()->{
			System.out.println("generating name...");
			Utils.delaySeconds(3000);
			return Utils.faker().name().fullName();
		}).map(String::toUpperCase);
		
	}
}
