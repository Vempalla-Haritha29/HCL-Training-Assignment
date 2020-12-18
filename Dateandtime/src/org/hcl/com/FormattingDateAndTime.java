package org.hcl.com;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingDateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDateTime ldt=LocalDateTime.now();
System.out.println("Before formatting:"+ldt);
DateTimeFormatter fdt=DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
String formattedDate=ldt.format(fdt);
System.out.println("After formatting:"+formattedDate);
	}

}
