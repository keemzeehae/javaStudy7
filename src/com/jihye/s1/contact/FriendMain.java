package com.jihye.s1.contact;

import java.util.ArrayList;
import java.util.HashMap;

public class FriendMain {

	public static void main(String[] args) {
		FriendController fc = new FriendController();
		fc.choose();
		
		ArrayList<Integer> ar = new ArrayList<>();
		ArrayList<Integer> ar2 = new ArrayList<>();
		
		HashMap<String, ArrayList<Integer>> map = new HashMap<>();
		map.put("number1", ar);
		map.put("number2", ar2);

	}

}
