//a program uses class Scanner for printing Area of a circle by accepting an input from keyboared

import java.util.Scanner;
  public class AreaCircleFloat {
      public static void main(String[] args)
      {
          Scanner input = new Scanner(System.in);
          double r, area;

          System.out.print("Enter area of a circle: ");
          r = input.nextDouble();
          area = Math.PI*r*r;

          System.out.printf("The area of the circle is  %f%n", area);
      }

  }
