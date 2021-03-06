package com.arraylistconcepts;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_LastIndexOf {

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
		players.add("Mahendra Singh Dhoni");
		players.add("Jasprit Bumrah");
		players.add("Yuzvendra Chahal");
		
		int lastIndex = players.lastIndexOf("Mahendra Singh Dhoni");
		
		System.out.println(lastIndex);             //9
		
		lastIndex = players.lastIndexOf("Sachin Tendulkar");
		
		System.out.println(lastIndex);          //-1

	}

}
