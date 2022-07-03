package com.practice.flex;

import java.util.Arrays;
import java.util.List;

import com.practice.Utils;

import reactor.core.publisher.Flux;

public class Lec03FromListOrArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		
		Flux.fromIterable(list).subscribe(Utils.onNext());
		
		Integer[] arr= {2,4,6,8};
		
		Flux.fromArray(arr).subscribe(Utils.onNext());

	}

}
