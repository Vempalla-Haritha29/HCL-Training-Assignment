package org.hcl.com;

	import java.text.SimpleDateFormat;
	import java.util.Calendar;
	import java.text.ParseException;
	public class AddingDates {
	   public static void main(String args[])
	   {
		
		String oldDate = "1999-01-29";  
		System.out.println("Date before Addition: "+oldDate);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		try{
		
		   c.setTime(sdf.parse(oldDate));
		}catch(ParseException e){
			e.printStackTrace();
		 }
		  
		c.add(Calendar.DAY_OF_MONTH, 10);  
		
		String newDate = sdf.format(c.getTime());  
	
		System.out.println("Date after Addition: "+newDate);
	   }
	}
