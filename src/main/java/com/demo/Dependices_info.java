
package com.demo;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
public class Dependices_info {
static public void alpha() {
		int a = 3095;
		System.out.println("integer " + a);
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
String g= sc.nextLine();
		int s = 89;
		sc.close();
		String str = s + g;
		// dependencies created ---> package imported here 
		// this method (isNotEmpty()) 
		if (StringUtils.isNotEmpty(g)) {
			System.out.println(g);
		} else {
			System.out.println("empty string");
		}

		System.out.println("first time  " + str);
	}
}
