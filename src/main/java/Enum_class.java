// Enumeration class means user defined constants: like some times we need name of days or months , or any other names we use Enum class for that.
public class Enum_class {
public static void main(String []args) {
	Week w1=Week.MON;
	Player p1=Player.AMAN;
	Week w2= Week.TUE;
	Player p2= Player.DANGI;
	Week w3= Week.FIR;
	Player p3=Player.MOHIT;
	Week w4=Week.SAT;
	Player p4=Player.PINKU;
	System.out.println("day :"+w1+","+"player :"+p1);
	System.out.println("day :"+w2+","+"player :"+p2);
	System.out.println("day :"+w3+","+"player :"+p3);
	System.out.println("day :"+w4+","+"player :"+p4);
	
}
}
enum Week {
	MON, TUE,WED,THU,FIR,SAT,SUN;   // these constants are by default public , static and final
} 
enum Player{
	MOHIT, PINKU,AMAN,DANGI;    // these constants are by default public , static and final
}

