package com.luv2code.springdemo;

public class BlahFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "today was blah";
	}

}
