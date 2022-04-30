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

		System.out.println("Select from the Following menue:" + "\n1: Display Members" + "\n2: Remove Member\r\n"
				+ "3: Add Member\r\n" + "4: Quit\r\n");

		int menue = 0;

		Scanner input = new Scanner(System.in);

		menue = input.nextInt();

		switch (menue) {
		case 1:
			try {
				File file = new File(path);
				Scanner input1 = new Scanner(file);
				ArrayList<ClubMember> listOfMembers = new ArrayList<ClubMember>();

				while (input1.hasNextLine()) {
					String[] line = input1.nextLine().split("\\*\\*");
					listOfMembers.add(new ClubMember(line[0], line[1], line[2], line[3]));
				}
// Removes the Headers as they were displaying as "Members Name: NAME".		
				listOfMembers.remove(0);

				for (ClubMember c : listOfMembers) {
					System.out.format("\nMembers Name : %s \n" + "Location: %s, %s\n" + "Favorite Language: %s\n",
							c.getName(), c.getCity(), c.getState(), c.getFpl());

				}

			} catch (FileNotFoundException e) {
				System.out.println("No File Here");
				e.printStackTrace();
			}
			break;
		case 2:
			try {
				File file = new File(path);
				Scanner input1 = new Scanner(file);
				ArrayList<ClubMember> listOfMembers = new ArrayList<ClubMember>();
				Scanner memberInfo = new Scanner(System.in);
				
				
				
				System.out.println("We finna make a new member!");
				
				while (input1.hasNextLine()) {
					String[] line = input1.nextLine().split("\\*\\*");
					listOfMembers.add(new ClubMember(line[0], line[1], line[2], line[3]));
					
					ClubMember clubmember = new ClubMember();
					
					System.out.println("\nEnter in new member name.");
					clubmember.setName(memberInfo.nextLine());
					
					System.out.println("\nEnter in new city.");
					clubmember.setCity(memberInfo.nextLine());
					
					System.out.println("\nEnter in new state.");
					clubmember.setState(memberInfo.nextLine());
					
					System.out.println("\nEnter in new favorite programing language.");
					clubmember.setFpl(memberInfo.nextLine());
					
					listOfMembers.add(clubmember);
					
					memberInfo.close();
					break;
				}
// Removes the Headers as they were displaying as "Members Name: NAME".		
				listOfMembers.remove(0);

				for (ClubMember c : listOfMembers) {
					System.out.format("\nNew Members Name : %s \n" + "New Location: %s, %s\n" + "New Favorite Language: %s\n",
							c.getName(), c.getCity(), c.getState(), c.getFpl());

				}

			} catch (FileNotFoundException e) {
				System.out.println("No File Here");
				e.printStackTrace();
			}
			break;
		}
		input.close();
	}
}