package com.arraylistconcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_SubList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		ArrayList<Integer> subList = new ArrayList<Integer>(list.subList(2, 7));
		
		System.out.println(subList);          //[3, 4, 5, 6, 7]
		
		System.out.println(list.subList(2, list.size()));			//[3, 4, 5, 6, 7, 8, 9, 10]
		
		list.subList(2, 6).clear();
		
		System.out.println(list);				//[1, 2, 7, 8, 9, 10]

	}

}
