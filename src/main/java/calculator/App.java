package calculator;
import java.lang.Math;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger=LogManager.getLogger(App.class);

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int exit=0;
        while(exit!=1) {
            System.out.println("CHOOSE");
            System.out.println("1.Square Root");
            System.out.println("2.Factorial");
            System.out.println("3.Natural Logarithm");
            System.out.println("4.Power Function");
            System.out.println("5.Exit");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("1.Square Root");
                System.out.println("enter the number whose square root is to be found");
                int a = sc.nextInt();
                System.out.println("Answer" + root(a));
            } else if (choice == 2) {
                System.out.println("2.Factorial");
                System.out.println("enter the number whose square root is to be found");
                int a = sc.nextInt();
                System.out.println("Answer" + factorial(a));
            } else if (choice == 3) {
                System.out.println("3.Natural Logarithmic");
                System.out.println("enter the number");
                int a = sc.nextInt();
                System.out.println("Answer" + log(a));
            } else if (choice == 4) {
                System.out.println("4.Power");
                System.out.println("enter 1st number");
                int a = sc.nextInt();
                System.out.println("enter second number");
                int b = sc.nextInt();
                System.out.println("Answer" + power(a, b));
            } else {
                exit = 1;
            }
        }
    }
    public static double root(int x)
    {
        double X=(double)x;
        logger.info("Factorial of"+x+"="+Math.sqrt(X));
        return (Math.sqrt(X));
    }
    public static int factorial(int x)
    {
        int ans=1;
        for(int i=2;i<=x;i++)
            ans=ans*i;
        logger.info("Factorial of"+x+"="+ans);
        return ans;

    }
    public static double log(int x)
    {
        double X=(double)x;
        logger.info("Logarithm of"+x+"="+Math.log(X));
        return (Math.log(X));
    }
    public static double power(int x,int y)
    {
        double X=(double)x;
        double Y=(double)y;
        logger.info("Power of"+x+"and"+y+"="+Math.pow(X,Y));
        return (Math.pow(X,Y));
    }
}
