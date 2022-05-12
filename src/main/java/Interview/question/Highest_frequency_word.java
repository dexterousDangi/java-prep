package Interview.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

//Q. How to find the word with the highest frequency from a file in Java?

public class Highest_frequency_word {

	public static void main(String[] args) {

		int count=0;
		String mostRepeated="";
		 HashMap<String , Integer> map= new HashMap<String, Integer>();
		 
		try(BufferedReader reader= new BufferedReader(new FileReader("C:\\Users\\Microsoft\\Desktop\\string class methods.txt"))){
			
			String line= reader.readLine();
			while(line!=null) {
				String [] words= line.toLowerCase().split(" ");   // to get symmetry in the text
				for(String word: words) {
					if(map.get(word)!=null) {
						map.put(word,map.get(word)+1);
						
					}else
						map.put(word, 1);
					
				}
				line=reader.readLine(); // to continue until the file reaches the end
			}
			
			Set<Entry<String, Integer>> itr =map.entrySet();
//			while(itr.hasNext()) {
//				Set<Entry<String , Integer>> ent = (Set<Entry<String, Integer>>) itr.next();  // here we have set of entries use for loop to iterate over them
				
				for(Entry<String , Integer> en:itr) {
					if(en.getValue()>count)
						count=en.getValue();
					mostRepeated= en.getKey();
				}
				
				System.out.println("The most repeated word in input file is: "+mostRepeated);
				System.out.println("Number Of Occurrences: "+count);
		
		
		}
			
			
		
		catch(IOException e	) {
			e.printStackTrace();
		}
	}

}
