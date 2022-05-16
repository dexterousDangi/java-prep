package Interview.question;

public class Permutation_of_a_string {

	public static String swapChar(String str, int i, int j) {
		char[] b = str.toCharArray();
		char c;
		c = b[i];
		b[i] = b[j];
		b[j] = c;
		String newstr = String.valueOf(b);
System.out.println("inside swap : "+ " str = "+newstr +" i="+i+" j= "+j);
		return newstr;

	}

	public static void getPermutation(String str, int start, int end) { // str="abc", start=0, end=3

		if (start == end - 1) { // in case string contains only one character
			System.out.println("inside if ");
			System.out.println("#### " + str);
		} else {
			for (int i = start; i < end; i++) {
				System.out.println("i ="+ start +"... ");
				
				System.out.println("str1: "+"str ="+ str +" start = "+start+ " i = "+i);
				str = swapChar(str, start, i);
				
				System.out.println( "into get pemuataion :"+"str= "+ str + " (start+1)-->"+ (start+1) + " end "+ end);
				getPermutation(str, start + 1, end);
				
				System.out.println("Str2: "+ "str= "+ str+" start= "+start+ " i = "+i);
				str = swapChar(str, start, i);
			}

		}
	}

	public static void print(int n) throws InterruptedException { // just an example of recursion
		if (n < 1) {

			return;

		}

		print(n - 1);
		System.out.println(n);
//	Thread.currentThread();
//	Thread.sleep(1000);
	}

	public static void main(String[] args) throws InterruptedException {

		String str = "abc";
		int n = 7;
		//  print(n);
		getPermutation(str, 0, str.length());

	}

}
