package com.trisect.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JLAB_S9_S10 {

	public List<Integer> newList(int[] arr) {

		ArrayList<Integer> al = new ArrayList<Integer>();
//		for(int i=0;i<arr.length;i++) {
//			Integer five=arr[i];
//			String str= five.toString();
//			char ch= str.charAt(str.length()-1);
//			if(ch=='5') {
//				int born= Integer.parseInt(str);
//				al.add(born);
//			}
//			
//		}
//		System.out.println(al.size());
//		System.out.println(al);

		for (int i = 0; i < arr.length; i++) {
			int abc = arr[i];
			if (abc % 10 == 5) {
				al.add(abc);
			}
		}

		return al;

	}

	public Set<Character> copyCat(String[] str) {

		LinkedHashSet<Character> hs = new LinkedHashSet<>();

		for (int i = 0; i < str.length; i++) {
			String check = str[i];
			for (int j = 0; j < check.length(); j++) {
				char ch = check.charAt(j);
				hs.add(ch);
			}
		}
		Iterator<Character> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
		System.out.println();
		return hs;

	}

	public Map<Integer, Integer> checkMany(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();

		int many = 0;
		for (int i = 0; i < arr.length; i++) {
			many = arr[i];
			if (map.get(many) != null)
				map.put(many, map.get(many) + 1);
			else
				map.put(many, 1);
		}
		Iterator<Integer> itr1 = map.keySet().iterator();
		System.out.println("printing only those elements which comes more than once :");
		while (itr1.hasNext()) {
			Integer key = itr1.next();
			if (map.get(key) > 1)
				System.out.println(key);
		}

		return map;
	}

	public void moreThan(String[] str) {

		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < str.length; i++) {
			String now = str[i];
			for (int j = 0; j < now.length(); j++) {
				char ch = now.charAt(j);
				if (hm.get(ch) != null) {
					hm.put(ch, hm.get(ch) + 1);
				} else {
					hm.put(ch, 1);
				}			
			}
		}
		Iterator<Character> itr2 = hm.keySet().iterator();
		while (itr2.hasNext()) {
			char c = itr2.next();
			if (hm.get(c) > 3) {
				System.out.println(c + " comes " + hm.get(c) + " times ");
			}
		}
	}

	public static void main(String[] args) {

		JLAB_S9_S10 obj = new JLAB_S9_S10();

		// task
		int[] arr = { 5, 500, 15, 40500, 32, 367, 0, 1 };
		System.out.println(obj.newList(arr) + " size of list :" + obj.newList(arr).size());
		System.out.println();

		// task
		String[] copyCat = { "hello", "how", "are", "you!!" };
		String[] num = { "12", "24", "36", "48", "60", "72" };
		obj.copyCat(copyCat);
		obj.copyCat(num);
		System.out.println();

		// task
		int[] num1 = { 10, 20, 30, 20, 40, 50 };
		int[] num2 = { 5, 5, 5, 5, 5, 5, 5, 5 };
		int[] num3 = { 1, 2, 3, 4, 1, 2, 3, 4 };
		obj.checkMany(num1);
		obj.checkMany(num2);
		obj.checkMany(num3);
		System.out.println();

		// task
		String[] str1 = { "aaaa", "bbb", "cc", "d", "ccde" };
		String[] str2 = { "9810098100", "9810116599" };
		obj.moreThan(str1);
		obj.moreThan(str2);
		
		
	}

}
