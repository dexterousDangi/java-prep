
public class Array_containing_objects {

	public static void main(String[] args) {

		Object[] e = new Object[5];
		e[0]=new Ep(12,"dangi");
		e[1]=new Tp(323,"Rohit");
		e[2]=new Ep(13, "mohit");
		e[3]= new Tp(325,"Ritu");
		e[4]=new Ep(14,"pinku");
		
		for(int i=0;i<e.length;i++) {
			
			if(e[i] instanceof Ep) {
				Ep e1= (Ep) e[i];
				System.out.println(e1.eid+" "+e1.ename);
			}
			else {
				Tp t=(Tp) e[i];
				System.out.println(t.tid+" "+t.tname);
			}
		}
//		}
//		for(Object` ee:e)
//			System.out.println(ee.eid+"  "+ ee.ename);
	}

}
class Ep{
	int eid;
	String ename;
	Ep(int eid, String ename){
		this.eid=eid;
		this.ename=ename;
	}
}
class Tp{
	int tid;
	String tname;
	Tp(int tid, String tname){
		this.tid=tid;
		this.tname=tname;
	}
}