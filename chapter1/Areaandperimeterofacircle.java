import java.util.Scanner;
public class Areaandperimeterofacircle
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
double radius,area,perimeter;
System.out.println("Enter the radius of the Circle :");
radius=sc.nextDouble();
area=radius*radius*Math.PI;
perimeter=2*radius*Math.PI;
System.out.println("Perimeter = "+perimeter+"\nArea = "+area);
sc.close();
}
}