package com.trisect.homework;

import java.util.Arrays;
import java.util.HashMap;

//HashMap holds series of key-value pairs. Where every key is can map to at most one value. In HashMap
//the keys are unique (no duplicates allowed).
//HashMap<KeyType, ValueType> map_name = new HashMap<KeyType, ValueType>();

public class J9C1 {

	private static void auth(String username, String pass, HashMap<String, String> user) {
		if (user.containsKey(username)) {
			System.out.println("userName found");
			String password = user.get(username);
			if (password.equals(pass)) {
				System.out.println("login correctly");
			} else {
				System.out.println("Wrong password eneterd..");
			}
		} else {
			System.out.println("doesn't have any user with this username ");
		}
		System.out.println();
	}

	private static void update(String user, String pass, HashMap<String, String> hmap) {
		if (hmap.containsKey(user)) {
			System.out.println("username exits");
			hmap.put(user, pass);
			System.out.println("password updated");
		} else {
			hmap.put(user, pass);
			System.out.println("user registered");
		}
		System.out.println();
	}

	public static void analyzeMarks(int[] marks) {
		System.out.println(Arrays.toString(marks));
		HashMap<String, Integer> grade = new HashMap<String, Integer>();
		int x = 0, y = 0, z = 0;
		for (int mark : marks) {
			if (mark >= 75) {
				x++;
				grade.put("Distinction", x);
			} else if (mark >= 33 && mark < 75) {
				y++;
				grade.put("pass", y);
			} else if (mark < 33) {
				z++;
				grade.put("fail", z);
			}
		}
		System.out.println(grade);
		System.out.println();
	}

	public static void countDuplicates(int[] arr) {
		System.out.println(Arrays.toString(arr));
		HashMap<Integer, Integer> number = new HashMap<Integer, Integer>();
		for (int num : arr) {
			if (number.get(num) != null) {
				number.put(num, number.get(num) + 1);
			} else {
				number.put(num, 1);
			}
		}
		System.out.println(number);
		System.out.println("unique: " + number.size());
	}

	public static void main(String[] args) {

		// example 1:
		HashMap<String, String> phoneDirectory = new HashMap<>();
		phoneDirectory.put("9999999123", "neo");
		phoneDirectory.put("9999999125", "aplha");
		phoneDirectory.put("9999999120", "tommy");
		phoneDirectory.put("9999999113", "rio");

		System.out.println("size of the map : " + phoneDirectory.size());
		System.out.println(phoneDirectory);

		phoneDirectory.put("9999999123", "tana");

		System.out.println("size of the map : " + phoneDirectory.size());
		System.out.println(phoneDirectory);
		System.out.println();

		// Example 2
		HashMap<String, String> user = new HashMap<>();
		user.put("nehakr", "123");
		user.put("mukesh", "ab#d");
		user.put("akshay.cool", "Ab$2");
		auth("nehakr", "123", user);
		auth("mukesh", "ab#d", user);
		auth("mukesh", "abd", user);
		auth("mukesh07", "ab#d", user);

		// Example 3
		String[] strArr = { "ab", "ba", "ab", "aba", "ba" };
		System.out.println(Arrays.toString(strArr));
		HashMap<String, Integer> unique = new HashMap<>();
		for (String str : strArr) {
			if (unique.containsKey(str)) {
				unique.put(str, unique.get(str) + 1);
			} else {
				unique.put(str, 1);
			}
		}
		System.out.println(unique.size());
		System.out.println(unique);
		System.out.println();

		// problem1
		HashMap<String, String> hmap = new HashMap<>();
		hmap.put("nehakr", "1243");
		hmap.put("mukesh07", "12");
		update("nehakr", "123", hmap);
		update("neeraj19", "1#2", hmap);

		// problem 2
		int[] arr = { 10, 20, 10, 30, 60, 90, 50, 10, 100, 150, 110 };
		System.out.println(Arrays.toString(arr));
		HashMap<String, Integer> filter = new HashMap<String, Integer>();
		filter.put("0-50", 0);
		filter.put("51-100", 0);

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];

			if (num <= 50) {
				int count = filter.get("0-50");
				count = count + 1;
				filter.put("0-50", count);
			} else if (num <= 100) {
				int count = filter.get("51-100");
				count = count + 1;
				filter.put("51-100", count);
			}

		}
		System.out.println(filter);
		System.out.println();

		// problem3
		int[] Marks = { 22, 19, 33, 40, 90, 83, 32, 75 };
		analyzeMarks(Marks);

		// problem 4
		int[] arr1 = { 1, 1, 1, 2, 3, 2, 5, 3, 2 };
		countDuplicates(arr1);
	}
}
