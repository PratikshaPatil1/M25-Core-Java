package org.tnsindia.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@SuppressWarnings("unused")
public class DemoOnTime_LocalDate {

	public static void main(String[] args) {
		//LocalDate d=LocalDate.now();
		//LocalTime obj=LocalTime.now();
		LocalDateTime obj1=LocalDateTime.now();
		LocalDate obj2=LocalDate.of(2022, 8, 17);
		//System.out.println(d);
        //System.out.println(obj);
		
		System.out.println(obj1);
		System.out.println(obj2);
	}

}
