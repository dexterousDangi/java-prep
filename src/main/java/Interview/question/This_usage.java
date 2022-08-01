package Interview.question;

public class This_usage {
	{  
	    int id;
	    int age;   
	    String name;
	    String address;  
	    public This_usage (int age)  
	    {  
	        this.age = age;  
	    }  
	    public This_usage(int id, int age)  
	    {  
	        this(age);  
	        this.id = id;  
	    }  
	    public This_usage(int id, int age, String name, String address)  
	    {  
	        this(id, age);  
	        this.name = name;   
	        this.address = address;   
	    }  
	    public static void main (String args[])  
	    {  
	    	This_usage emp = new This_usage(105, 22, "Vikas", "Delhi");  
	        System.out.println("ID: "+emp.id+" Name:"+emp.name+" age:"+emp.age+" address: "+emp.address);  
	    } 
}
