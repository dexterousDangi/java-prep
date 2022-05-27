package Interview.question;

import java.io.IOException;

public class LaunchingExternalApps {

	public static void main(String[] args) {
		
		Runtime runtime= Runtime.getRuntime();
		try {
			runtime.exec("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			System.out.println("program runned correctly");
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		
	}

}
