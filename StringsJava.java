package Basics;


/**
 * 
 * @author Shahana Basheer 6.Strings in java
 *
 */
public class StringsJava {

	public static void main(String args[]) {

		String str1 = "Welcome ";
		String newstr;
		String str2 = "WELCOME";
		String s = new String("To Java String ");

		System.out.println("1.First string " + str1);
		System.out.println("1.Second string " + s);

		newstr = str1 + " " + s;
		System.out.println("2.Concatenated string " + newstr);

		System.out.println("3.Length of string is: " + newstr.length());

		System.out.println("4.Substring from string " + newstr.substring(11, 15));

		System.out.println("5.Using Indexof: " + newstr.indexOf("To"));

		System.out.println("6.String matches regular expression :" + newstr.matches("(.*)To(.*)"));

		System.out.println("7.String compare: " + str1.equals(s));

		System.out.println("8. String compare ingore case:" + str1.equalsIgnoreCase(str2));

		System.out.println("  String starts with W :" + str1.startsWith("W"));

		System.out.println("   String ends with E: " + str2.endsWith("E"));

		System.out.println("    String compare to :" + str1.compareTo(str2));

		System.out.println("9.String before trim " + str1 + "java");
		System.out.println("9.String after trim:" + str1.trim() + "java");

		System.out.println("10.String replace :" + str2.replace('E', 'e'));

		System.out.println("11.String split..");
		String words[] = newstr.split("\\s+");
		for (String w : words) {
			System.out.println(w);
		}

		int i = 100;
		
		System.out.println("12.Converting numbers to string:" + String.valueOf(i));

		System.out.println("13.Integer object to string :" + Integer.toString(i));

		System.out.println("14.To upper case: " + newstr.toUpperCase());
		System.out.println("  To lower case :" + newstr.toLowerCase());

	}
}
