import java.util.Scanner;
/**
* Program that will find the midpoint of a line segment.
*
* Project 2
* @author Jordan Gonder - COMP 1210 - 002
* @version 09 - 07 - 2018
*/
public class MidpointOfLineSegment {
/**
* Prints out the midpoint of a line after given points on a line.
* @param args Command line arguments - not used
*/
   public static void main(String[] args) {
      System.out.println("Enter the coordinates for endpoint 1:");
      
      Scanner userInput = new Scanner(System.in);
      double x1, x2, y1, y2;
      
      System.out.print("\tx1 = ");
      x1 = userInput.nextDouble();
      
      System.out.print("\ty1 = ");
      y1 = userInput.nextDouble();                 
      
      System.out.println("Enter the coordinates for endpoint 2:");
      
      System.out.print("\tx2 = ");
      x2 = userInput.nextDouble();
      
      System.out.print("\ty2 = ");
      y2 = userInput.nextDouble();
      
      double xMid = (x1 + x2) / 2;
      double yMid = (y1 + y2) / 2;
      
      System.out.println("For endpoints (" + x1 + ", " + y1 + ") "
         + "and (" + x2 + ", " + y2 + "), the midpoint is ("
         + xMid + ", " + yMid + ").");
      
   }
}
