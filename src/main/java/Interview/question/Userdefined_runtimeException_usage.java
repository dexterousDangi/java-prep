package Interview.question;

public class Userdefined_runtimeException_usage {
public static void status(int age) {
	if(age>18) {
		System.out.println("allowed to have driving license");
	}
	else if(age<18) {
		throw new InvalidAge_Unchecked_Exception("wait till you get 18 yr. old");
	}
}
	
	public static void main(String[] args) { 
		status(12);
		status(21);
	}

}
