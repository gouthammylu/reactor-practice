package com.practice.flex;

import java.time.Duration;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import com.practice.Utils;

import reactor.core.publisher.Flux;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Flux.range(1, 10)
          .subscribeWith(new Subscriber<Integer>() {

              private Subscription subscription;

              @Override
              public void onSubscribe(Subscription subscription) {
                 this.subscription = subscription;
              }

              @Override
              public void onNext(Integer next) {
                  System.out.println(next);
              }

              @Override
              public void onError(Throwable throwable) {

              }

              @Override
              public void onComplete() {
                  System.out.println("done");
              }

          });
		
		Utils.delaySeconds(2000);


	}

}
