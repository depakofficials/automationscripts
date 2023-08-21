package javaselenium.seleniumscripts;

import java.time.LocalDateTime;

public class Dateandtime {
	public static void main(String[] args) {
		
		LocalDateTime localdateandtime = LocalDateTime.now();
		System.out.println(localdateandtime);
		String dateandtimeformat = localdateandtime.toString().replace(";", "-");
		System.out.println(dateandtimeformat);
		System.out.println(LocalDateTime.now().toString().replace(";", "-"));
	}
}
