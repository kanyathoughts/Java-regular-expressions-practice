package testcases.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge2 {

	public static void main(String[] args) {
		String challenge8 = "abcd.135uvqz.7tzik.999";
		String digitsGroup = "[A-Za-z]+\\.(\\d+)"; //we want digits so we put that into one group by giving inside parenthesis
		Pattern p = Pattern.compile(digitsGroup);
		Matcher m = p.matcher(challenge8);
		//System.out.println(m.matches());
		
		while (m.find()) {
			System.out.println("Occurrence : " + m.group(1));
			
		}
		//System.out.println(challenge8.matches("\\D{4}\\.\\d{3}\\D{4}\\.[0-9]{1}\\D{4}\\.9{3}"));
	
		String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
		String digitsGroup1 = "([A-Za-z]+)\\.(\\d+)\\s";
		//System.out.println(challenge9.matches(digitsGroup1));
		Pattern p1 = Pattern.compile(digitsGroup1);
		Matcher m1 = p1.matcher(challenge9);
		System.out.println(m1.groupCount());
		//start 5 end 7
		//start 15 end 15
		//start 23 end 25
		while (m1.find()) {
			System.out.println("start: " + m1.start(2) + " end: " + (m1.end(2) - 1)); //we are subtracting 1 from end as we need inclusive index numbers.
			//inclusive means eg: 7abc. start index of 7 is 0 and ed index is 1 (Exclusive) but in inclusive end index also 0 as only one character.
		}
		
		String challenge10 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
		//String extractNumbers = "[{](\\d, \\d)[}][, ]*"; //we are putting curly brackets inside square brackets as it has special purpose in reg ex.
		String extractNumbers = "\\{(.+?)\\}"; //remember this very important.
		//. for any character
		//+ for at least one character
		//? for to become + to lazy character otherwise only one match it will find and it will consider 1st opening and take all closing and opening braces and take the last closing brace.
		Pattern p2 = Pattern.compile(extractNumbers);
		Matcher m2 = p2.matcher(challenge10);
		System.out.println(m2.groupCount());
		while (m2.find()) {
			System.out.println("occurrence: " + m2.group(1));
		}
		

		String extractNumbers1 = "\\{(\\d), (\\d)\\}";
		Pattern p3 = Pattern.compile(extractNumbers1);
		Matcher m3 = p3.matcher(challenge10);
		System.out.println(m3.groupCount());
		System.out.println("***********************");
		while (m3.find()) {
			System.out.println(m3.group(1));
			System.out.println(m3.group(2));
		}
		
		

	}

}
