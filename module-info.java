import java.util.Scanner;
public class Assignment01 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print ("Input the first number:");
		double x = in.nextDouble();
		System.out.print ("Input the second number:");
		double y = in.nextDouble();
		System.out.print ("Input the third number:");
		double z = in.nextDouble();
		System.out.print ("The three numbers are:" (x,y,z)"\n");
		System.out.print ("The sum of the numbers is:" + sum(x,y,x)+"\n");
		System.out.print ("The average of the numbers is " + average(x, y, z)+"\n");
	}
	public static double sum(double x, double y, double z)
    {
        return (x + y + z);
    }
	public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }
}