
public class RemoveWhiteSpaces {
	 public static void main(String[] args)
	    {
	        String str1 = "Saket Saurav        is a QualityAna    list";
	  
	        //1. Using replaceAll() Method
	  
	        String str2 = str1.replaceAll ("\\s", "");           // using regex to manipulate the string.
	  
	        System.out.println(str2);
	  
	           }
	}

