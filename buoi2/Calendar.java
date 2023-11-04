package buoi2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Calendar {
	private static Scanner sc;

	public static void main(String[] args) {
		Date A = new Date();
		
		sc = new Scanner(System.in);
		System.out.print("Nhập năm : ");
		int year = sc.nextInt();
		System.out.println("--------------------");
		LocalDate date = LocalDate.of(year, 1, 1);
		DayOfWeek day = date.getDayOfWeek();
		int k = 0;
		switch(day) {
			case MONDAY : 
				k = 2;
				break;
			case TUESDAY :
				k = 3;
				break;
			case WEDNESDAY :
				k = 4;
				break;
			case THURSDAY :
				k = 5;
				break;
			case FRIDAY :
				k = 6;
				break;
			case SATURDAY :
				k = 7;
				break;
			case SUNDAY :
				k = 8;
				break;
		}
		A.inCalendar( year , k);
	}
}
