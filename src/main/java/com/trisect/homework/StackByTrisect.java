package com.trisect.homework;

import java.util.Stack;

public class StackByTrisect {

	public static void main(String[] args) {
		Stack<Integer> team= new Stack<>();
		for(int i=1; i<=10;i++ ) {
			team.push(i*i*2);
		}
		System.out.println(team+" ->this stack size is: "+ team.size());
		System.out.println(team.empty());
		System.out.println(team.peek());  // -> will always gives element at the last index.
		System.out.println(team.pop());  //-> will remove the last element in the stack 
		System.out.println(team);
		System.out.println("size of the element : "+team.search(2));   // will give element index from the last
		System.out.println("size of the element : "+team.search(162));
	}

}
