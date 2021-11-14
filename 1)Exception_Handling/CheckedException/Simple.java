import java.util.*;
class Simple
{
static void getDivide(int a,int b)
{
int c=0;
try
{
c=a/b;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println(c);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a:");
int a=sc.nextInt();
System.out.println("Enter the values of b:");
int b=sc.nextInt();
getDivide(a,b);
}
}