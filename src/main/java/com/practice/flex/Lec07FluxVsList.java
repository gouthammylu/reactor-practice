package com.practice.flex;

import com.practice.Utils;

public class Lec07FluxVsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NameGenerator.getNames().subscribe(Utils.onNext());

	}

}
