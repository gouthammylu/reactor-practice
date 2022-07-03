package com.practice;

import reactor.core.publisher.Mono;

public class Lec04MonoEmptyOrError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		userRepository(1).subscribe(Utils.onNext(),
									Utils.onError(),
									Utils.onComplete());
		userRepository(2).subscribe(Utils.onNext(),
				Utils.onError(),
				Utils.onComplete());
		userRepository(3).subscribe(Utils.onNext(),
				Utils.onError(),
				Utils.onComplete());
		

	}
	
	public static Mono<String> userRepository(Integer userId){
		
		if(userId==1)
			return Mono.just(Utils.faker().name().firstName());
		else if(userId==2)
			return Mono.empty();
		else
			return Mono.error(new RuntimeException("Not in range"));
		
	}

}
