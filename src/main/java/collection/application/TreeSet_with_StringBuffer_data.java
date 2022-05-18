package collection.application;

import java.util.Comparator;

// Q: when we add the stringbuffer data into the treeset collection will it perform the sorting or not?
// A: and answer is no, because to perform sorting sortedSet Interface is used which check whether the stringbuffer class contians
// comparagble interface or not . and stringbuffer class does'nt contains comparabale interface. so it will give a runtime execption 

import java.util.TreeSet;

public class TreeSet_with_StringBuffer_data {



	public static void main(String[] args) {
        try {
		TreeSet< StringBuffer> treeset=new TreeSet<StringBuffer>();
		treeset.add(new StringBuffer("dangi"));
		treeset.add(new StringBuffer("dev"));
		treeset.add(new StringBuffer("dino"));
		treeset.add(new StringBuffer("dani"));
		System.out.println(treeset);
        }
        catch(ClassCastException i) {
        	System.out.println("comparable interface is not present in the ");
        }
        
        // treeset with comparator usage
        TreeSet< StringBuffer> treeset=new TreeSet<StringBuffer>(new ForStringBuffer());
		treeset.add(new StringBuffer("dangi"));
		treeset.add(new StringBuffer("dev"));
		treeset.add(new StringBuffer("dino"));
		treeset.add(new StringBuffer("dani"));
		System.out.println(treeset);
	}

}

// so to resolve the exception we use customized sorting option which is comparator usage 
// write a class which implements comparator interface for stringBuffer data

class ForStringBuffer implements Comparator<StringBuffer>{

	public int compare(StringBuffer o1, StringBuffer o2) {
		String str1=o1.toString();
		String str2=o2.toString();
		
		return str1.compareTo(str2);
	}
	
}