package Interview.question;

import java.util.Scanner;

// our resource
//https://www.youtube.com/watch?v=XmSOWnL6T_I&ab_channel=Pepcoding

public class PalindromicSubStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		boolean[][] dp = new boolean[s.length()][s.length()]; // we are creating a square and going to use its diagonal
																// and all other things.
		int count = 0;

		for (int gap = 0; gap < s.length(); gap++) {

			for (int i = 0, j = gap; j < dp.length; i++, j++) { // by doing so we can travel along the diagonals

				if (gap == 0) { // because when gap is zero then there is only one character and that is always
								// palindrome in nature

					dp[i][j] = true;
					
				}else if(gap==1) {// when there are two character in the string then,check they are equal or not
					if(s.charAt(i)==s.charAt(j)) {
						dp[i][j]=true;
					}else {
						dp[i][j]=false;
					}
				}else {
					if(s.charAt(i)==s.charAt(j) && dp [i+1][j-1]==true) {  // if string contains more than two characters then, check the starting and ending char
																			// and for middle part of the string use the previously complied data(i.e., diagonal is true or not)
						dp[i][j]=true;
					}else {
						dp[i][j]=false;
					}
				}
				if(dp[i][j]) {
					count++;
				}
			}
		}
		System.out.println("the no. of palndormic substring in the <"+s+"> is: "+count);
	     scan.close();
	}

}
