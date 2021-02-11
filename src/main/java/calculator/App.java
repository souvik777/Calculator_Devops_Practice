package calculator;

import java.util.Scanner;

public class App {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 1st number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        System.out.println("Answer"+add(a,b));
    }
    public static int add(int x,int y)
    {
        return (x+y);
    }
}
