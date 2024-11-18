//Calculate the area and perimeter of Rectangle
import java.util.Scanner;
public class Area_and_perimeter_of_a_rectangle
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
double w,h,area,perimeter;
System.out.println("Enter the width and height of a Rectangle :");
w=sc.nextDouble();
h=sc.nextDouble();
area=w*h;
perimeter=2*(w+h);
System.out.println("Area = "+area+"\nPerimeter = "+perimeter);
sc.close();
}
}