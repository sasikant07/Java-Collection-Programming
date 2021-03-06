package com.arraylistconcepts;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Get {

	public static void main(String[] args) {
		List<String> players = new ArrayList<String>();
		
		players.add("Rohit Sharma");
		players.add("Virat Kohli");
		players.add("Mahendra Singh Dhoni");
		players.add("Shikhar Dhawan");
		players.add("Hardik Pandya");
		players.add("Lokesh Rahul");
		players.add("Rishabh Pant");
		players.add("Ravindra Jadeja");
		players.add("Bhuvaneshwar Kumar");
		players.add("Jasprit Bumrah");
		players.add("Yuzvendra Chahal");
		
		String firstName = players.get(0); 
		
		String lastName = players.get(10);
		
		System.out.println(firstName);          //Rohit Sharma
		
		System.out.println(lastName);			//Yuzvendra Chahal
	}

}
