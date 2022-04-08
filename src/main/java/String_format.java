  import java.util.Scanner;

public class String_format {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.nextLine();
			int x = sc.nextInt();
			float ff = sc.nextFloat();
			System.out.printf(" %-15s\n", s1);
			System.out.printf("Integer data : %-8d\n", x);
			System.out.printf("double data type : %9.5f\n", ff);
		}
		System.out.println("================================");
		sc.close();
	}
}