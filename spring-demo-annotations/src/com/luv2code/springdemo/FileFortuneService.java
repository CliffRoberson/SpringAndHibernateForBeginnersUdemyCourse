package com.luv2code.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private Random myRandom = new Random();
	
	List<String> fortunes = new ArrayList<String>();

	//define my init method
	@PostConstruct
	public void readInFortunes() {
		
		try {
			Scanner sc = new Scanner(new File("Fortunes"));
				
			while (sc.hasNextLine()) {
			  fortunes.add(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(fortunes.size());
		
		return fortunes.get(index);				
	}

}
