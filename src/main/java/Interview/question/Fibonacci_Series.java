package Interview.question;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int n= 27;
		int f=1; 
		int s=1;
		int t=0;
		System.out.print(f);
		System.out.print(" "+s);
		for(int i=3; i<=n;i++) {
			t=f+s;
			System.out.print(" "+t);
			f=s;
			s=t;
		}
	}

}
