import java.io.*;

public class java_io_package_basic {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// byte oriented stream
		
		FileInputStream fis = new FileInputStream("F:\\eclipse workspace\\java-prep\\src\\main\\java\\abc.txt");
		FileOutputStream fos = new FileOutputStream("F:\\eclipse workspace\\java-prep\\src\\main\\java\\xyz.txt");

		int c;
		while ((c = fis.read()) != -1) {
		System.out.print((char)c);
			fos.write(c);
		}
		System.out.println();
		fis.close();
		fos.close();
		System.out.println("byte oriented streaming completed");
		
		// character oriented stream
		System.out.println();
		
		FileReader fr= new FileReader("F:\\eclipse workspace\\java-prep\\src\\main\\java\\msn.txt");
		FileWriter fw= new FileWriter("F:\\eclipse workspace\\java-prep\\src\\main\\java\\pqr.txt");
		 
		int b;
		while((b=fr.read())!=-1) {
			System.out.print((char)b);
			fw.write(b);
		}
		System.out.println();
		fr.close();
		fw.close();
		System.out.println("character streaming finished");
		}

	// NOT A EFFICENT APPROACH FOR LARGE TEXT FILE , WHICH CONATINS MILLIONS OF CHARATERS
	// THERE FOR THAT FILE , IT HAS TO CALL THE METHODS FOR MILLION TIMES AND HIT THE MEMORY FOR MILLION TIMES TO READ THE CHARATERS
	// SO THIS IS A COSTLY PROCESS FOR LARGE FILES IN TERMS OF SPACE, TIME, PERFORMANCE ETC.
	// FOR LARGER FILES WE USE LINE ORIENTED STREAM , WHICH READS LINE BY LINE,(USE BUFFERED STREAM FOR THAT PURPOSE)
}
/*
 * output:
using for java.io.package 
used in example during practice
by pardeep dangi
streaming completed

using character oriented channel
to read and write the data 
operations done by pardeep dangis
character streaming finished

*/ 
