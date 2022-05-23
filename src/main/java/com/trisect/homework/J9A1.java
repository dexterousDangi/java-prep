package com.trisect.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class J9A1 {

	public static void main(String[] args) {
		
		// task1
		
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		int len = fruits.size();
		System.out.println(len);
		fruits.add("Orange");
		len = fruits.size();
		System.out.println(len);
		System.out.println(fruits);
		fruits.set(0, "dragon");
		System.out.println(fruits);
		System.out.println();
		
		//task 2:

		ArrayList<Integer> number= new ArrayList<>();
		number.add(12);
		number.add(13);
		number.add(9);
		number.add(10);
		for(int i=0; i<number.size();i++) {
			int num=number.get(i);
			System.out.println("number at index "+ i+" is "+ num);
			num=num+5;
			number.set(i, num);
		}System.out.println(number);
		System.out.println();
		
		// task 3
		
		int [] num3= {10,11,12,13,14,15,16,17,18,19,20};
		System.out.println(Arrays.toString(num3));
		ArrayList<Integer> num= new ArrayList<>();
		for(Integer a :num3) {
			num.add(a+1);
		}System.out.println(num);
		System.out.println();
		
		//task4
		int [] arr4= {1,2,3,4,5};
		allEven(arr4);
		
		// task5
		ArrayList<Integer> arrList= new ArrayList<>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		arrList.add(5);
		arrList.add(6);
		System.out.println(arrList);
		int count =0;
		for(Integer aa: arrList) {
			arrList.set(count,	2*aa);
			count++;
		}System.out.println(arrList);
		
	}

	private static void allEven(int[] arr4) {
		ArrayList<Integer> num= new ArrayList<>();
		for(int a: arr4) {
			if(a%2==0) {
				num.add(a);
			}
		}System.out.println(num);
		System.out.println();
	}

}
