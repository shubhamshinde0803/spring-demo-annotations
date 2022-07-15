package com.shubham.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = { "beware of the wolf in sheep's clothing", "diligence is the mother of good luck",
			"the journey is the reward" };

	// create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		/*
		 * //pick random number int index = myRandom.nextInt(data.length); String
		 * theFortune = data[index];
		 * 
		 * 
		 * return theFortune;
		 */
		//Home PC path
		//File file = new File("E:\\Workspace\\spring-demo-annotations\\fortuneFile.txt");
		
		//Laptop path
		File file = new File("C:\\Users\\Shubham_p\\EclipseWorkspace\\spring-demo-annotations\\fortuneFile.txt");

		java.util.List<String> lines = new ArrayList<String>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			String line;
			try {
				while ((line = br.readLine()) != null) {
					lines.add(line);
//					System.out.println(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String[] data = lines.toArray(new String[] {});
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
