package Utilities;

import java.sql.Timestamp;
import java.util.Date;

import org.testng.annotations.Test;

@Test
public class DateClass {
 
	public void getCurrentDate()
	{
	Date date = new Date();
	System.out.println(new Timestamp(date.getTime()));
	}
}
