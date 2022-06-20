
public class AnonymousInnerClass_basic {
			PlaneClass p= new PlaneClass() {
				public void first() {
					System.out.println("first method of PlaneClass");
				}
				public void second() {
					System.out.println("second method of PlaneClass");
				}
			};
	public static void main(String[] args) {
		AnonymousInnerClass_basic ap=new AnonymousInnerClass_basic();
		ap.p.first();
		ap.p.second();
	}

}
class PlaneClass{
 public void first(){}
 public void second() {}
}