import java.util.*;
class Square
{
int getSquare(int n)
{
return n*n;
}
public static void main(String args[])
{
Square a=new Square();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
a.getSquare(n);
System.out.println(a.getSquare(n));
}
}
