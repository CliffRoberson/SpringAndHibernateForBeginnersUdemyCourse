package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortune implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortunes = new String[] {"f1","f2","f3"};
		Random r = new Random();
		return fortunes[r.ints(0,3).findFirst().getAsInt()];
	}

}
