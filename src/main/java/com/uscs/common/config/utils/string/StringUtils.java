package com.uscs.common.config.utils.string;

import java.sql.Timestamp;
import java.util.Calendar;

public class StringUtils {
	
	Calendar calendar = Calendar.getInstance();
	
	
	public Boolean containsSpecial(String s1){
		Boolean containsSpecial = false;
		s1 = s1.trim();
		String s2 = s1.replaceAll("[^a-zA-Z0-9.]", "");
		
			if (s2.equalsIgnoreCase(s1)){
					return containsSpecial = true;
			}
			return containsSpecial;
	}
	
	public Boolean isNumbers(String s1){
		
		Boolean isNumeric = false;
		s1 = s1.trim();
		String s2 = s1.replaceAll("[^0-9]", "");
			if (s2.toString().equalsIgnoreCase(s1.toString())){
				return isNumeric = true;
			}
		return isNumeric;
	}

	public String stripSpecial(String s1){
		String s2 = s1.replaceAll("[^a-zA-Z0-9.]", "");
		return s2;
	}
	
	
	public Timestamp createTimeStamp(String dateTime){
		
		String s1= dateTime.replaceAll("[^a-zA-Z0-9.]", "");
		
		
		StringBuilder dateTimeMod = new StringBuilder();
		dateTimeMod.append(s1.substring(4, 8));
		dateTimeMod.append("-");
		dateTimeMod.append(s1.substring(0, 2));
		dateTimeMod.append("-");
		dateTimeMod.append(s1.substring(2, 4));
		dateTimeMod.append(" ");
		dateTimeMod.append(s1.substring(8, 10));
		dateTimeMod.append(":");
		dateTimeMod.append(s1.substring(10, 12));
		dateTimeMod.append(":");
		dateTimeMod.append("00");
		
		return	Timestamp.valueOf(dateTimeMod.toString());
	}
	
}
