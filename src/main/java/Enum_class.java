// Enumeration class means user defined constants: like some times we need name of days or months , or any other names we use Enum class for that.
// Enum is the super class of the enum
// it is not possible to create child class of enum because enum is by default final and public
public class Enum_class {
	public static void main(String[] args) {
		Week w1 = Week.MON;
		Player p1 = Player.AMAN;
		Week w2 = Week.TUE;
		Player p2 = Player.DANGI;
		Week w3 = Week.FIR;
		Player p3 = Player.MOHIT;
		Week w4 = Week.SAT;
		Player p4 = Player.PINKU;
		System.out.println("day :" + w1 + "," + "player :" + p1);
		System.out.println("day :" + w2 + "," + "player :" + p2);
		System.out.println("day :" + w3 + "," + "player :" + p3);
		System.out.println("day :" + w4 + "," + "player :" + p4);

		Week[] w = Week.values();   // values method return all the constants present in the Enum
		for (Week ww : w)
			System.out.println("day: " + ww + " ordinal/index: " + ww.ordinal());

	}
}

enum Week {
	MON, TUE, WED, THU, FIR, SAT, SUN; // these constants are by default public , static and final
}

enum Player {
	MOHIT, PINKU, AMAN, DANGI; // these constants are by default public , static and final
}
