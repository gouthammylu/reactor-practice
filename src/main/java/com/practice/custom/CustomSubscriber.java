package com.practice.custom;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class CustomSubscriber implements Subscriber<Object> {
	
	private String name="";
	
	public CustomSubscriber() {

	}

	public CustomSubscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void onSubscribe(Subscription s) {
		// TODO Auto-generated method stub
		s.request(Long.MAX_VALUE);
		
	}

	@Override
	public void onNext(Object t) {
		// TODO Auto-generated method stub
		
		System.out.println(name+" Received "+t);
		
	}

	@Override
	public void onError(Throwable t) {
		// TODO Auto-generated method stub
	
		System.out.println(name+" Error "+t.getMessage());
		
	}

	@Override
	public void onComplete() {
		// TODO Auto-generated method stub
		System.out.println("Completed");
		
	}

}
