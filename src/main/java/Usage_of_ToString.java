
public class Usage_of_ToString {
	int eid;
	String ename;
	Usage_of_ToString( int eid, String ename)
	{
	this.eid = eid;
	this.ename= ename;
	}
	public String toString()    // overriding tostring() method
	{
	System.out.println("employee id  :"+eid);

	System.out.println("employee name   :"+ename);
	return "dangi";}

	public static void main(String []args)
	{
		Usage_of_ToString obj= new Usage_of_ToString(12,"dangi");
	System.out.println(obj);
	System.out.println(obj.toString());
	  
	     // now the real deal is that we want whenever we print reference varialbe it will
	     // print the Emp data not the hash code.
	     // by overriding it is possible, override the toString() method
	     // then Emp toString() method will be printed

	}
}
