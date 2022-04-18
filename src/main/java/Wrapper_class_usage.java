
public class Wrapper_class_usage {

	public static void main(String[] args) {
       // a way to create object of wrapper class using constructor 
		Integer i = new Integer(23);
         Float f= new Float(12);
         System.out.println(i+f);
        
         // creating object using valueOf() method
        Integer ii= Integer.valueOf(43);
        Float ff= Float.valueOf(23);
        System.out.println(ii+ff);
       
        // using xxxValue() method to convert the warpper object to primitive data type
        int i1= ii.intValue();
        float fff= ff.floatValue();
        System.out.println(i1+fff);
        
        // to save all the usage of valueOf() and xxxValue() methods
        // we using autoboxing and auto unboxing concept to create the wrapper object and primitive objects back form wrapper objects
        
        Integer i2 = 332; //<--- autoboxing (directly creating objects of wrapper class)
        int i3= i2;     // <-- auto-unboxing (directly converting wrapper object to the primitive type data)
        System.out.println(i2+i3);
        
        //parsexxx() method usage : used to convert the string data into number type data
        
        String str1="42";
        String str2 ="333.35";
        
        Integer i4= Integer.parseInt(str1);
        int i5= Integer.parseInt(str1);
         
        Float f1= Float.parseFloat(str2);
        float f2= Float.parseFloat(str2);
        System.out.println(i4+i5+f1+f2);;
         
        // here we can pass any of the six value( int, short, byte, long, double, float)
        //Because Number class is direct sub class of object class 
        // and Number class in turn contians 6 subclass ( int, short, byte, long, double, float)
        numberClass(3); 
       numberClass(23.4f);
     
       
	}

	private static void numberClass(Number i) {
		System.out.println(i);
		
	}

}
