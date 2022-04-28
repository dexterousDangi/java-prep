// Anonymous inner class : means class without name yet it is automatically internally created, name  of ".class" file be ending with "$" sign

interface Gear {
	void first();
	void Second();
}

public class Anonymous_inner_class {
static int speed1=10;
static int speed2=30;
Gear gg=new Gear() {

	@Override
	public void first() {
		System.out.println("for electric vehical:" +Anonymous_inner_class.speed1);
	}

	@Override
	public void Second() {
		System.out.println("for electric vehical :"+Anonymous_inner_class.speed2);
	}
	
};
	public static void main(String[] args) {
	Gear g = new Gear() {

			public void first() {
			System.out.println(Anonymous_inner_class.speed1);
			}

			public void Second() {
				System.out.println(Anonymous_inner_class.speed2);
			}
			
		};
		
		g.first();     // when anonymous class declared inside the main method
		g.Second();
		
		Anonymous_inner_class aa=new Anonymous_inner_class();
		
		aa.gg.first();   // when anonymous class decalred in instance area this is how we call the class 
		aa.gg.Second();
}

}

