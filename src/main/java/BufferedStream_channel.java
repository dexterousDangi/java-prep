import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream_channel {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// using buffered reader and writer channel (which is the best approach to read
		// and write the data)

		BufferedReader br = new BufferedReader(
				new FileReader("F:\\eclipse workspace\\java-prep\\src\\main\\java\\abc.txt"));
		BufferedWriter bw = new BufferedWriter(
				new FileWriter("F:\\eclipse workspace\\java-prep\\src\\main\\java\\tqm.txt"));

		// now read the data using readLine() method whose return type is string
		// readLine() method read the data line by line not character by character

		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
			bw.write(str);
			bw.newLine();
		}
		br.close();
		bw.close();

		System.out.println();

		// using buffered input stream and output stream to read the data it is
		// typically works as file input stream and output stream channel
		// using buffered input stream it is not possible to read the data line by line
		
			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream("F:\\eclipse workspace\\java-prep\\src\\main\\java\\msn.txt"));
			BufferedOutputStream bos = new BufferedOutputStream(
					new FileOutputStream("F:\\eclipse workspace\\java-prep\\src\\main\\java\\buff.txt"));

			// read() method of buffered input stream will return asiic value of the
			// character store that value into an integer
			int c;
			while ((c = bis.read()) != -1) {
				System.out.print((char) c);
				bos.write(c);
			}

		
		bis.close();
		bos.close();
		
	}

}
