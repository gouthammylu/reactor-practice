package com.practice;

import java.util.function.Consumer;

import org.reactivestreams.Subscriber;

import com.github.javafaker.Faker;
import com.practice.custom.CustomSubscriber;

public class Utils {

	public static final Faker FAKER = Faker.instance();

	public static Consumer<Object> onNext() {

		return o -> System.out.println("RECEIVED: " + o);

	}

	public static Consumer<Throwable> onError() {

		return err -> System.out.println("ERROR: " + err.getMessage());

	}

	public static Runnable onComplete() {

		return () -> System.out.println("COMPLETED");

	}

	public static Faker faker() {

		return FAKER;

	}

	public static void delaySeconds(int n) {

		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Subscriber<Object> subscriber(){
		
		return new CustomSubscriber();
	}
	
	public static Subscriber<Object> subscriber(String name){
		
		return new CustomSubscriber(name);
	}

}
