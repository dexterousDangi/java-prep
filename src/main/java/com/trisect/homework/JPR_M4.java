package com.trisect.homework;

public class JPR_M4 {

	public static void main(String[] args) {

		// task2
		String str1 = "jcack";
		String res1 = str1.substring(0, 3);
		System.out.println("first 3: " + res1);
		String out1 = str1.substring(str1.length() - 3);
		System.out.println("last 3 :" + out1);
		String ot1 = str1.substring(str1.length() - 3, str1.length());
		System.out.println("last 3: " + ot1);

		System.out.println(str1.lastIndexOf('c'));
		System.out.println();

		// task3
		String str2 = "pardeep";
		if (str2.length() % 2 == 0) {
			String strF = str2.substring(0, str2.length() / 2);
			System.out.println("First Half : " + strF);
			String strL = str2.substring(str2.length() / 2);
			System.out.println("Second half : " + strL);
		} else {
			String strf = str2.substring(0, str2.length() / 2);
			System.out.println("first half : " + strf);
			char strM = str2.charAt(str2.length() / 2);
			System.out.println("middle char : " + strM);
			String strl = str2.substring((str2.length() / 2) + 1);
			System.out.println("last half : " + strl);
		}
		System.out.println();
		;

		// task4
		String str4 = "MASTERS@TRISECT";
		int a4 = str4.indexOf('T');
		System.out.println("first : " + a4);
		int b4 = str4.indexOf('T', a4 + 1);
		System.out.println("second : " + b4);
		System.out.println();

		// task5
		String str5 = "0101111011";
		System.out.println(str5);
		int a5 = str5.indexOf('0');
		if (a5 != -1) {
			System.out.println("First : " + a5);
			int b5 = str5.indexOf('0', a5 + 1);
			if (b5 != -1) {
				System.out.println("second : " + b5);
				int c5 = str5.indexOf('0', b5 + 1);
				if (c5 != -1) {
					System.out.println("third : " + c5);
				} else {
					System.out.println("not found ");
				}
			} else {
				System.out.println("not found");
			}
		} else {
			System.out.println("NOt found");
		}
		System.out.println();

		// task6
		String str6 = "wowxmas";
		String strF = str6.substring(0, str6.indexOf('x'));
		System.out.println("first : " + strF);
		String strL = str6.substring(str6.indexOf('x') + 1);
		System.out.println("second : " + strL);
		System.out.println();

		// task8
		int n8 = 8;
		System.out.println(n8);
		String str8 = "";
		switch (n8) {
		case 1:
			str8 = "one";
			break;
		case 2:
			str8 = "two";
			break;
		case 3:
			str8 = "three";
			break;
		case 4:
			str8 = "four";
			break;
		case 5:
			str8 = "five";
			break;
		case 6:
			str8 = "six";
			break;
		case 7:
			str8 = "seven";
			break;
		case 8:
			str8 = "eight";
			break;

		}
		System.out.println(str8);
		System.out.println();

		// task 9
		int n9 = 12;
		System.out.println("month : " + n9);
		String month = "";
		switch (n9) {
		case 1:
			month = "january";
			break;
		case 2:
			month = "febuary";
			break;
		case 3:
			month = "march";
			break;
		case 4:
			month = "april";
			break;
		case 5:
			month = "may";
			break;
		case 6:
			month = "june";
			break;
		case 7:
			month = "july";
			break;
		case 8:
			month = "august";
			break;
		case 9:
			month = "september";
			break;
		case 10:
			month = "octobar";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;
		default:
			System.out.println("enter valid data ?");
		}
		System.out.println(month);
		System.out.println();

		// task 10
		char ch10 = 'a';
		switch (ch10) {
		case 'A':
			System.out.println("Apple");
			break;
		case 'B':
			System.out.println("Bat");
			break;
		case 'C':
			System.out.println("Cat");
			break;
		default:
			System.out.println("None");
		}
		System.out.println();

		// task11
		String str11 = "A cat ran down the lane";
		String out11[] = str11.split(" ");
		System.out.println("no. of words : " + out11.length);
		for (int i = 0; i < out11.length; i++) {
			String str = out11[i];
			System.out.print(str + ">" + str.length() + " ");
		}
		System.out.println();
		System.out.println();

		// task 12
		String str12 = "12434";
		Integer ii = Integer.parseInt(str12);
		System.out.println(ii);
		System.out.println();

		// task 13
		String str13 = "08/11/2121";
		String day = str13.substring(0, 2);
		String mnth = str13.substring(3, 5);
		String year = str13.substring(6);

		int mon = Integer.parseInt(mnth);
		String mth = "";
		switch (mon) {
		case 1:
			mth = "jan";
			break;
		case 2:
			mth = "feby";
			break;
		case 3:
			mth = "mar";
			break;
		case 4:
			mth = "apr";
			break;
		case 5:
			mth = "may";
			break;
		case 6:
			mth = "jun";
			break;
		case 7:
			mth = "jul";
			break;
		case 8:
			mth = "aug";
			break;
		case 9:
			mth = "sept";
			break;
		case 10:
			mth = "oct";
			break;
		case 11:
			mth = "Nov";
			break;
		case 12:
			mth = "Dec";
			break;
		default:
			System.out.println("enter valid data ?");
		}
		System.out.println(day + "-" + mth + "-" + year);
		System.out.println();

		// task 14
		String str14 = "9845646466";
		String st14 = str14.toLowerCase();
		String out14 = "";
		char[] ch = st14.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int size = i;
			if (i < ch.length - 1) {
				if (ch[size++] == ch[size]) {
					out14 = "yes";
					break;
				} else
					out14 = "no";
			}
		}
		System.out.println("consecutive : " + out14);
		System.out.println();

		// task 15
		try {
			String a15 = "12/03/2016";
			String b15 = "02/03/2016";
			int Da = Integer.parseInt(a15.substring(0, 2));
			int Db = Integer.parseInt(b15.substring(0, 2));
			System.out.println("days : " + Da + "," + Db);
			int Ma = Integer.parseInt(a15.substring(3, 5));
			int Mb = Integer.parseInt(b15.substring(3, 5));
			System.out.println("months : "+Ma + ", " + Mb);
			int Ya = Integer.parseInt(a15.substring(6));
			int Yb = Integer.parseInt(b15.substring(6));
			System.out.println("years : "+Ya + "," + Yb);
			if (Ya > Yb) {
				System.out.println("earlier date : " + b15);
			} else if (Yb > Ya) {
				System.out.println("earlier data :" + a15);
			}
			if (Ya == Yb) {
				if (Ma > Mb) {
					System.out.println("earlier data : " + b15);
				} else if (Mb > Ma) {
					System.out.println("earlier data : " + a15);
				} else if (Ma == Mb) {
					if (Da > Db) {
						System.out.println("earlier date : " + b15);
					} else if (Db > Da) {
						System.out.println("earlier date : " + a15);
					} else if (Da == Db) {
						System.out.println("both dates are same");
					}
				}

			}
		} catch (NumberFormatException e) {
			System.out.println("please enter correct data");
		}
		System.out.println();
			
	}
}
