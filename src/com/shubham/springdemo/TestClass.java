package com.shubham.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TestClass {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Shubham_p\\EclipseWorkspace\\spring-demo-annotations\\fortuneFile.txt");
		
		java.util.List<String> lines = new ArrayList<String>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String line;
			try {
				while((line = br.readLine()) != null) {
					lines.add(line);
					System.out.println(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String[] data= lines.toArray(new String[] {});
		

	}

}
