package com.trisect.homework;

public class For_loop_basic {

	public static void main(String[] args) {
		System.out.println("Start");
		for (int i = 1; i <= 8; i++) {
			System.out.println(i);
		}
		System.out.println("End");

		int sum = 0;
		for (int i = 1; i <= 4; i++) {
			sum = sum + (i * i);
		}
		System.out.println(sum);

		int su = 0;
		for (int i = 1; i <= 3; i++) {
			su = su + (i * i * i); // (1^3+2^3+3^3)
		}
		System.out.println(su);

		int qud = 0;
		for (int i = 1; i <= 4; i++) {
			qud = qud + (i * i * i * i);
		}
		System.out.println(qud);

		int sumr = 1;
		for (int i = 1; i <= 5; i++) {
			sumr = sumr * i;
		}
		System.out.println(sumr);

		String str = "Prod-";
		for (int i = 1; i <= 10; i++) {
			System.out.println(str + i + "=" + (2 * i));
		}

		String st = "#";
		String srt = "";
		for (int i = 1; i <= 5; i++) {
			srt = srt + st;
			System.out.println(srt);
		}

		for (int i = 1; i <= 4; i++) {
			System.out.println("num=" + i + ":rem:" + (i % 3));
		}
		
		int mul;
		for(int i=1; i<=4;i++) {
			mul = i*i-i;
			System.out.println(i+"*"+i+"-"+i+"="+mul);
		}
		
		int dd;
		for(int i=1; i<=4;i++) {
			dd = i+i*i+i*i*i;
			System.out.println(i+"+"+i+"*"+i+"+"+i+"*"+i+"*"+i+"="+dd);
		}
	
	
	
	
	
	}

}
