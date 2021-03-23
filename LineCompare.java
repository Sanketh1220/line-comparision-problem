import java.io.*;
import java.math.*;
import java.util.Scanner;
import java.lang.Math;

public class LineCompare
{
	public static void main(String args[])
	{	
		System.out.println("This is line comparision problem");

		Scanner a = new Scanner(System.in);
		System.out.println("Enter x1 value: ");
		int x1 = a.nextInt();

		Scanner b = new Scanner(System.in);
      System.out.println("Enter y1 value: ");
      int y1 = b.nextInt();

		Scanner c = new Scanner(System.in);
      System.out.println("Enter x2 value: ");
      int x2 = c.nextInt();

		Scanner d = new Scanner(System.in);
      System.out.println("Enter y2 value: ");
      int y2 = d.nextInt();

		Scanner e = new Scanner(System.in);
      System.out.println("Enter p1 value: ");
      int p1 = e.nextInt();

      Scanner f = new Scanner(System.in);
      System.out.println("Enter q1 value: ");
      int q1 = f.nextInt();

      Scanner g = new Scanner(System.in);
      System.out.println("Enter p2 value: ");
      int p2 = g.nextInt();

      Scanner h = new Scanner(System.in);
      System.out.println("Enter q2 value: ");
      int q2 = h.nextInt();

		double lenLine1 = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
		System.out.println("Length of line 1: " + lenLine1);

		double lenLine2 = Math.sqrt(Math.pow((p2 - p1),2) + Math.pow((q2 - q1),2));
      System.out.println("Length of line 2: " + lenLine2); 		

		Double First, Second;
	
		First = new Double (lenLine1);
		Second = new Double (lenLine2);
		int result = First.compareTo(Second);

		if(result > 0) {
         System.out.println("Line1 is greater than Line2");
      } else if(result < 0) {
         System.out.println("Line1 is less than Line2");
      } else {
         System.out.println("Line1 is equal to Line2");
      }	
		
	}
}
