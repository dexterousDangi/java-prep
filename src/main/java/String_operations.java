
public class String_operations {

	public static void main(String[] args) {
		String str ="dangi";
		String st= "dangi";
		
		System.out.println(str);   // ---> dangi
		String str1=str.concat("dear");
		System.out.println(str);  //  ---> dangi
		System.out.println(str1);  // ---->dangidear
		
	StringBuffer sb = new StringBuffer("dangi");
	StringBuffer sbb= new StringBuffer("dangi");
	System.out.println(sb.equals(sbb));    // false
	System.out.println(str.equals(st));    // true
	// only string class equals method perform content comparison , other class 
	// equlas() method perform reference comparison not content comparison
	
	
	System.out.println(sb);   //----> dangi
	sb.append("dear");
	System.out.println(sb);    //  --->dangidear	
	
	}

}

class Emp {
	int id ;
	String str;
	Emp(int id, String str) {
		this.id =id;
		this.str= str;
		}

public Emp() {
	}
public String toString() {
	System.out.println(id);
	System.out.println(str);
	return id+str;
}

public static void main(String []args) {
	Emp e = new Emp(4651,"nro");
	System.out.println(e);
	System.out.println(e.toString());
}
}