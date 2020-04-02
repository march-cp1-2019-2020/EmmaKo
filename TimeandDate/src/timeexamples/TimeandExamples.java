//Emma Ko
//4.2.2020
package timeexamples;
	import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;

public class TimeandExamples {
	public static void main(String args []) {
		
		LocalDateTime localDate = LocalDateTime.now();
		System.out.println(localDate);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-YY");
		System.out.println(dtf.format(localDate));
	}
}
