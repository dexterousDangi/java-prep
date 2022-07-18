package dao_Factory_design;
/**
 * Data Access Object Pattern or DAO pattern is used to separate low level data accessing API or
 *  operations from high level business services.

DAO pattern is based on abstraction and encapsulation design principles and 
shields rest of application from any change in the persistence layer
 e.g. change of database from Oracle to MySQL, change of persistence technology 
 e.g. from File System to Database.
 */
public class Student {
	private String name;
	   private int rollNo;

	   Student(String name, int rollNo){
	      this.name = name;
	      this.rollNo = rollNo;
	   }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
}
