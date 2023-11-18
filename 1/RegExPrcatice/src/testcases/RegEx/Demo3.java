package testcases.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo3 {

	public static void main(String[] args) {
		String s1 = "tktvtzt";
		//String tNotVRegEx = "t[^v]"; //we don't want t followed by v.
		//And one thing we have to remember here is the last character t is not included but still it is not followed by v but it is not there in matcher because the character class look for t which is followed by any character except v.
		//String tNotVRegEx = "t(?!v)"; //This is called "Look a head negation" and it will include the last t also but it is not followed by v because this class will not consume characters inside it. It will consider t if it is not followed by v or any other character also.
		String tNotVRegEx = "t(?=v)"; //This is t should followed by v.
		Pattern pattern = Pattern.compile(tNotVRegEx);
		Matcher matcher = pattern.matcher(s1);
		int count = 0;
		while(matcher.find()) {
			count++;
			System.out.println("Occurrence" + count + " : " + matcher.start() + " to " + matcher.end());
		}
		
		//or operator
		String s2 = "harry";
		System.out.println("s2: " + s2.replaceAll("[H | h]", "Y"));
		
		String phoneNumber = "(800) 123-4567";
		//String phoneNumber = "(800) 123-4567";
		boolean value = phoneNumber.matches("^[(]\\d*[)] \\d*-\\d*"); //we have to give parenthesis inside the square brackets to ignore matcher group and digits we have to specify the occurrence count.
		System.out.println(value);
		
		String visaNumberNew = "4123456789012345";
		String visaNumberOld = "4123456789012";
		boolean value2 = visaNumberOld.matches("^4\\d{12}(\\d{3})?$"); //we can give optional 3 numbers inside the group and we can give ? (or) * for zero (or) more occurrence.
		System.out.println("value2: " + value2);
		boolean value3 = visaNumberNew.matches("^4\\d{12}(\\d{3})?$");
		System.out.println("value3: " + value3);

	}

}
