import java.util.Scanner;
/**
* This program will convert and display the raw time measurement(in seconds)
* in days, hours, minutes and seconds.
* Project 2
* @author Jordan Gonder - COMP 1210 - 002
* @version 09 - 07 - 2018
*/
public class TimeConverter {
/**
* Converts and displays seconds in days, hours, minutes, and seconds.
* @param args Command line arguments  - not used
*/ 
   public static void main(String[] args) {
      Scanner rawTime = new Scanner(System.in);
      int days, hours, minutes, seconds, rawTimeMeasurement;
      
      System.out.print("Enter the raw time measurement in seconds: ");
      rawTimeMeasurement = rawTime.nextInt();
      
      if (rawTimeMeasurement < 0) {      
         System.out.println("Measurement must be non-negative!"); 
      }
      else {
         days = rawTimeMeasurement / 86400;
         hours = rawTimeMeasurement % 86400 / 3600;
         minutes = rawTimeMeasurement % 3600 / 60;
         seconds = rawTimeMeasurement % 60;
             
         System.out.println("Measurement by combined days, hours, minutes, "
            + "seconds:");
         System.out.println("\tdays: " + days);
         System.out.println("\thours: " + hours);
         System.out.println("\tminutes: " + minutes);
         System.out.println("\tseconds: " + seconds);
         
         System.out.println(rawTimeMeasurement + " seconds = " + days  
            + " days, " + hours + " hours, " + minutes + " minutes, " + seconds 
            + " seconds");
           
              
      }
      
   }
      
}
