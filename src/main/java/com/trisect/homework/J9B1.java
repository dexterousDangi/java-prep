package com.trisect.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

//HashSet class is used when we want to store unique values or unique object.
//If we try to add a duplicate element it simple rejects them.
// there is no index base search or insertition in HashSet.
public class J9B1 {

	public static void main(String[] args) {

		// task1

		int[] arr = { 2, 1, 2, 4, 3, 3, 4, 5 }; // notice duplicates
		System.out.println(Arrays.toString(arr) + " = length: " + arr.length);
		HashSet<Integer> mySet = new HashSet<Integer>();
		for (Integer a : arr) {
			mySet.add(a);
		}
		System.out.println(mySet + " = length: " + mySet.size());
		System.out.println();

		// task2
		// The contains() method of HashSet is very efficient. Due to internal working
		// of HashSet
		// searching an elements takes constant time irrespective of input size.

		int[] arr2 = { 2, 5, 6, 26, 2, 7, 8 };
		for (int a : arr2) {
			if (mySet.contains(a)) {
				System.out.println("present : " + a);
			} else {
				System.out.println("absent :" + a);
			}
		}
		System.out.println();

		// task3
		int [] arr3= {20, 10, 10, 20, 30, 40, 50, 30};
		System.out.println(Arrays.toString(arr3));
		HashSet<Integer> hset= new HashSet<>();
		for(Integer a: arr3) {
			if(hset.contains(a)) {
				System.out.println("duplicate : "+a);
			}
			hset.add(a);
		}System.out.println(hset);
		System.out.println();
		
		//task4
		HashSet<Character> hst= new HashSet<>();
		hst.add('c');
		hst.add('o');
		String str4="chocolate";
		String newstr="";
		for(int i=0; i<str4.length();i++) {
			char ch=str4.charAt(i);
			if(hst.contains(ch)) {
				newstr=newstr+"#";
			}else {
				newstr=newstr+ch;
			}
		}System.out.println(str4);
		System.out.println(newstr);
		System.out.println();
		
		//task5
		String str5="abracadabra";
		System.out.println(str5);
		HashSet<Character> st= new HashSet<>();
		for(int i=0; i<str5.length();i++){
			char ch=str5.charAt(i);
			if(st.contains(ch)) {
				System.out.println("$: "+ch);
			}
			st.add(ch);
		}System.out.println(st);
		System.out.println();
		
		// task6
		ArrayList<String> strlist=new ArrayList<>();
		strlist.add("mat");
		strlist.add("cat");
		strlist.add("bad");
		strlist.add("mat");
		strlist.add("cat");
		strlist.add("bat");
		strlist.add("mat");
	
		replaceDup(strlist);
			System.out.println(strlist);
			System.out.println();
			
			// task7
			int [] arr1= {2,1,3,5};
			int [] ar2= {3,4,0,1,10};
			commonFromTwo(arr1,ar2);
			
			
			
	}

	private static void commonFromTwo(int[] arr1, int[] arr2) {
		HashSet<Integer> set= new HashSet<>();
		ArrayList<Integer> list= new ArrayList<>();
		for(Integer a: arr1) {
			if(set.contains(a)) {
				list.add(a);
			}else {
				set.add(a);
			}
		}
		for(Integer a:arr2) {
			if(set.contains(a)) {
				list.add(a);
			}else {
				set.add(a);
			}
		}
		System.out.println(list);
	}

	private static void replaceDup(ArrayList<String> strlist) {
		HashSet<String> hash=new HashSet<>();
		for(int i=0 ;i<strlist.size();i++) {
			if(hash.contains(strlist.get(i))) {
				strlist.set	(i,"hello");
			}else {
				hash.add(strlist.get(i));
			}
		}System.out.println(hash);
	}

}
