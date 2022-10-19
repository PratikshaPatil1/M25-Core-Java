package org.tnsindia.date_time;

import java.time.LocalTime;
import java.time.ZoneId;

public class DemoOnZoneID {

	public static void main(String[] args) {
		LocalTime t=LocalTime.now(ZoneId.of("US/Alaska"));
		System.out.println(t);
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}

	}

}
