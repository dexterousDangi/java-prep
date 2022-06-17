
public class FirstNonRepeatedCharFirst {

	 public static void main(String args[]) {
	     
	        String inputStr ="teeter";
	        /**
	         * if both 'indexOf() and lastIndexOf()' gives same index means that is the
	         * first non repeating character.
	         */
	        for(char i :inputStr.toCharArray()){
	        if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
	            System.out.println("First non-repeating character is: "+i);
	            break;
	        }
	        }
	    }
}
