package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SoftwareDeveloperClub {

	public static void main(String[] args) throws IOException {

		String path = "members.txt";
		
		
		try {
		File file = new File(path);
		Scanner input = new Scanner(file);		
		ArrayList<ClubMember> listOfMembers = new ArrayList<ClubMember>();
		
		
		while(input.hasNextLine()) {
			String[] line = input.nextLine().split("\\*\\*");
			listOfMembers.add(new ClubMember(line[0], line[1], line[2], line[3]));		
		}
// Removes the Headers as they were displaying as "Members Name: NAME".		
		listOfMembers.remove(0);

		for(ClubMember c : listOfMembers) {
			System.out.format("\nMembers Name : %s \n"
					+ "Location: %s, %s\n"
					+ "Favorite Language: %s\n", 
					c.getName(), c.getCity(), c.getState(), c.getFpl());
			
		}
		input.close();
		} catch(FileNotFoundException e) {
			System.out.println("No File Here");
			e.printStackTrace();
		}
	}
}