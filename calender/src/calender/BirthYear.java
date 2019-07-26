package calender;

import java.time.Year;

public class BirthYear {

	public static void main(String[] args) {
		int year=Year.now().getValue();
		int age=25;
		int res=year-age;
		
		System.out.println("Your birth year is "+res);

	}

}
