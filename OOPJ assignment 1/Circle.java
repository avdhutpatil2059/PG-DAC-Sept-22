 import java.util.Scanner;
class Circle
{
  
    public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the radius of circle");
	  double radius = sc.nextDouble();
	  
	  double area = 3.14*radius*radius;
	  double circ = 2*3.14*radius;
	  
	  System.out.println(" The Area of circle is = "+area);
	  System.out.println(" The Circumference of circle is = "+circ);
	
	
	}
  


}