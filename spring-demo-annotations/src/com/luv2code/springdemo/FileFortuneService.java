package com.luv2code.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

private Random myRandom = new Random();
	
	@Override
	public String getFortune() {

		Scanner sc;
		List<String> lines = new ArrayList<String>();
		try {
			sc = new Scanner(new File("Fortunes"));
		
		
		while (sc.hasNextLine()) {
		  lines.add(sc.nextLine());
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] arr = lines.toArray(new String[0]);
		
		int index = myRandom.nextInt(arr.length);
		
		String theFortune = arr[index];		
		
		return theFortune;
	}

}
