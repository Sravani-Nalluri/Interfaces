package com.codebind2;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class DateMain {
	
		  public static void main(String[] args) {
		    LocalDate Obj1 = LocalDate.now(); // Create a date object
		    LocalTime Obj2= LocalTime.now();
		    LocalDateTime obj3 = LocalDateTime.now();
		    System.out.println(obj3);
		    
		    System.out.println(Obj1); // Display the current date
		    System.out.println(Obj2);

}
}
