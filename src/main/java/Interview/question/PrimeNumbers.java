package Interview.question;

import java.util.ArrayList;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println(findPrime(1,100));
	}

	private static ArrayList<Integer> findPrime(int start, int end) {
		ArrayList<Integer> primes=new ArrayList<>();
		for(int n=start;n<end;n++) {
			boolean prime=true;
			int i=2;
			while(i<= n/2) {
				if(n%i==0) {
					prime=false;
					break;
				}
				i++;
			}
			if(prime) {
				primes.add(n);
			}
			
			
		}
		
		return primes;
}
}