package dao_Factory_design;

//: Use the StudentDao to demonstrate Data Access Object pattern usage 

public class DaoPatternDemoApplication {

	public static void main(String[] args) {

		 StudentDao studentDao = new StudentDaoImpl();

	      // print all students
	      for (Student student : studentDao.getAllStudents()) {
	         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	      }
	      
	   // update student
	      Student student =studentDao.getAllStudents().get(0);
	      student.setName("Michael");
	      studentDao.updateStudent(student);
	      
	      // get the student
	      studentDao.getStudent(0);
	      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");		
	   
	}

}
