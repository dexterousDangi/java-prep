package Interview.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Q. Write a java program to find number of characters, number of words, number of lines, number of number character and no. of special character in a text file?
		
public class Reading_txt_file_and_count_character {

	public static void main(String[] args){

		int charCount=0, wordCount=0,lineCount=0;
		int number=0; int specialChar=0;
		try (
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Microsoft\\Desktop\\string class methods.txt"));  // use character oriented channel to create a data stream.
			)
			
		{
			String currentLine= reader.readLine();
			while(currentLine!=null) {
				
				lineCount++;
				
				String [] words= currentLine.split(" ");  // will give us the words
				wordCount= wordCount+words.length;   // will give us the count of the words
				
				for(String word: words) {
					charCount= charCount+word.length();  // will give us the character count array by array
							char [] w= word.toCharArray();
							for(char ww:w) {
								if(ww>='0' && ww<='9') {
									number++;
								}
							if((ww>='!' && ww<= '/')||(ww>=':'&& ww<='@')) {
								specialChar++;
							}
							}
				}
			currentLine=reader.readLine(); // to set the condition true again.
			
			}
			charCount= charCount-number-specialChar;
			System.out.println("no. of number character present :"+ number);
			System.out.println("no. of specia character present :"+ specialChar);
			System.out.println("no. of lines in the file :"+lineCount);
			System.out.println("no. of words in the file :"+ wordCount);
			System.out.println("no. of charater in the file :"+ charCount);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
