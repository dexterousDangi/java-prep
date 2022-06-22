
public class StringFormatUsage {

	public static void main(String[] args) {

		String str1 = "Dangi";
		System.out.println(String.format("My name is %s", str1)); // %s = to concate the strings

		System.out.println(String.format("my answer is %8d", 2434)); // %d = means Integer data, and %8d means that it
																		// take 8 space data

		String str2 = "alpha";
		String str3 = "teamUpteamUp";
		System.out.println(String.format("my info "+"is: %1$s, %1$s and %2$s",str2,str3));   // %1$s means first agrs(str2) and %2$s means second args(str3)
		
		int num=1203;
		System.out.println(String.format("%08d", num));   // %08d means eight space size and empty space is filled with 0.
		
		
		
		
		
	}

}
