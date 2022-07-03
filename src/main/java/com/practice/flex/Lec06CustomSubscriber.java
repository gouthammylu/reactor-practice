package com.practice.flex;

import java.util.concurrent.atomic.AtomicReference;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import com.practice.Utils;

import reactor.core.publisher.Flux;

public class Lec06CustomSubscriber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AtomicReference<Subscription> ref=new AtomicReference<Subscription>();
		
		Flux.range(1, 10)
			.subscribeWith(new Subscriber<Integer>() {

				@Override
				public void onSubscribe(Subscription s) {
					// TODO Auto-generated method stub
					System.out.println("in subscription");
					ref.set(s);
					
				}

				@Override
				public void onNext(Integer t) {
					// TODO Auto-generated method stub
					System.out.println("in next: "+t);
					
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					System.out.println("in error: "+t.getMessage());
					
				}

				@Override
				public void onComplete() {
					// TODO Auto-generated method stub
					System.out.println("completed");
				}
				
			}
					);
		
		Utils.delaySeconds(2000);
		ref.get().request(3);
		Utils.delaySeconds(2000);
		ref.get().request(2);
		Utils.delaySeconds(2000);
		ref.get().cancel();
		Utils.delaySeconds(2000);
		ref.get().request(3);
		Utils.delaySeconds(2000);

	}

}
