package Interview.question;

import org.apache.commons.lang3.StringUtils;

public class CountOccurencesOfWords_usingThirdPartyLibraries {

	public static void main(String[] args) {
		System.out.println("using maven repository support:");
		int count = StringUtils.countMatches("Alive is Awesome", 'e');
		System.out.println("given word is present for "+count + " times.");

	}

}
