
public class ConcatenateStringUsingDifferentWays {

	public static void main(String[] args) {
		String str1="hello";
		String str2="world";
		
		// 1 way: using third variable to concatenate .
		String res1=str1+str2+" its dangi here";
		System.out.println(res1);
		
		// 2 way: using concat() method.
		String res2=str1.concat(str2);
		System.out.println(res2);
		
		// 3 way: using StringBuffer class and append() method
		StringBuffer sb= new StringBuffer();
		sb.append(str1).append(str2).append(" this is it");
		System.out.println(sb);
		
		// 4 way: using StringBuffer and join() method.
			String str4=String.join("-", str1,str2);
			System.out.println(str4);
		
		//5 way: using StringBuilder class and append method
		StringBuilder sbuild= new StringBuilder();
		sbuild.append(str1).append(str2);
		System.out.println(sbuild);
		
	}

}
