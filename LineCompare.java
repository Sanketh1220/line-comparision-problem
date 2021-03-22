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

		double len = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
		System.out.println(len); 		
		
	}
}
