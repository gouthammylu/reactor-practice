package com.practice;

import reactor.core.publisher.Mono;

public class Lec09FromRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mono.fromRunnable(doSomething()).subscribe(Utils.onNext(),
				Utils.onError(),()->System.out.println("task completed"));

	}
	
	
	private static Runnable doSomething() {
		
		return ()->System.out.println("performing some task..");
		
	}

}
