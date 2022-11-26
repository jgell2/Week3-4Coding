package week3Coding;

import java.util.Scanner;

public class CodingAssignment13 {
	
	static Scanner s = new Scanner(System.in);
	

//this program uses the method sleepOrStudy to determine whether the user should go to sleep or study based on the time of day, hours studied this week and days until the next class
	public static void main(String[] args) {
		int closestHour = 0;
		int hoursStudied = 0;
		int nextClassIn = 0;
		
		System.out.println("Please enter the closest hour in military time (0-23)");
		closestHour= s.nextInt();
		System.out.println("Please enter number of hours studied this week, round to the nearest number");
		hoursStudied = s.nextInt();
		System.out.println("please enter the number of days until your next class");
		nextClassIn = s.nextInt();
		
		if(sleepOrStudy(closestHour, hoursStudied, nextClassIn) == true) {
			System.out.println("You should study");
		}else {
			System.out.println("You should sleep");
		}
	}
	public static boolean sleepOrStudy(int closestHour, int hoursStudied, int nextClass) {
		if(closestHour<=23 && closestHour>=8 || (hoursStudied<20 && nextClass<2)) {
			return true;
		} else{
			return false;
		}
	}
}
