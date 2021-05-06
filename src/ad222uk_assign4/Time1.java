package ad222uk_assign4;

import java.lang.System; 
public class Time1 {
	private static int longLength = 100;
	private static String lstr="";

	public static void main(String[] args) {

	    for (int i = 0; i < longLength ; i++) {
	      lstr += "z";

	    }
	    
		for (int i = 0; i < 15; i++) {

			str1char();
			str100char();
			stronecharacter();
		}
	}
	
	public static void str1char() { 

		long before = System.currentTimeMillis();
		String str = ""; 
		while (System.currentTimeMillis() - before < 1200) { 
			str = str + "z";
		}
		long after = System.currentTimeMillis();
		int compute_time = (int) (after - before); 
		System.out.println("Short String: Time: " + compute_time + "   range: "
				+ str.length() + ". length: " + str.length() + "\n");
	}

	public static void str100char() {

		String string = "";
		long before = System.currentTimeMillis();
		while (System.currentTimeMillis() - before < 1200) {
			string = string + lstr;

		}
		long after = System.currentTimeMillis();
		int estimatedTime = (int) (after - before);
		System.out.println("Long String: Time: " + estimatedTime + " milliseconds.  Concatenations: "
				+ (string.length() / 100) + ".  Total length: " + string.length() + "\n");
	}

	public static void stronecharacter() {

		StringBuilder str = new StringBuilder();
		long before = System.currentTimeMillis();
		while (System.currentTimeMillis() - before < 1200) {
			str.append("c");
		}
		long after = System.currentTimeMillis();
		int estimatedTime = (int) (after - before);

		long start = System.currentTimeMillis();
		str.toString();
		long finish = System.currentTimeMillis();
		int Time = (int) (finish - start);

		StringBuilder st = new StringBuilder();
		long starrt = System.currentTimeMillis();
		while (System.currentTimeMillis() - start < 1200 - Time) {
			st.append("c");
		}
		long endPoint = System.currentTimeMillis();
		int newEstimatedTime = (int) (endPoint - start);
		
		System.out.println("Before ToString:  Time: " + estimatedTime + " milliseconds." +"|"+
				 " Concatenations: " + str.length() +"|"+".  Total length: " + str.length());
		System.out.println("ToString time: " + Time + " milliseconds.");
		System.out.println("After ToString:  Time: " + (newEstimatedTime + Time)+"|"
				+ " milliseconds.  Concatenations: " +"|"+ st.length() + ".  Total Length: "
				+ st.length() + "\n");

	}
	
	public static void str100Char() {

		StringBuilder str = new StringBuilder();
		long start = System.currentTimeMillis();
		while (System.currentTimeMillis() - start < 1200) {
			str.append(lstr);
		}
		long end = System.currentTimeMillis();
		int estimatedTime = (int) (end - start);

		long begin = System.currentTimeMillis();
		str.toString();
		long finish = System.currentTimeMillis();
		int toStringTime = (int) (finish - begin);

		StringBuilder newBuilder = new StringBuilder();
		long startPoint = System.currentTimeMillis();
		while (System.currentTimeMillis() - startPoint < 1200 - toStringTime) {
			newBuilder.append(lstr);
		}
		long endTime = System.currentTimeMillis();
		int newTime = (int) (endTime - startPoint);
		
		System.out.println("Before ToString:  Time: " + estimatedTime + " milliseconds."+"|"
				+ " Concatenations: " + str.length() +"|"+ ".  Total length: " + str.length());
		System.out.println("ToString time: " + toStringTime + " milliseconds.");
		System.out.println("After ToString:  Time: " + (newTime + toStringTime)
				+ " milliseconds.  Concatenation: " + (newBuilder.length() / 100) + ".  Total Length: "
				+ newBuilder.length() + "\n");
	}
}
