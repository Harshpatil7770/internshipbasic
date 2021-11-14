import java.util.*;
class Count
{
void getDivide(int a,int b)
{
try
{
int c=a/b;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
catch(Exception e)
{
System.out.println(e);
}
finally
{
System.out.println("Rest of the code...");
}
}
public static void main(String args[])
{
Count c1=new Count();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a");
int a=sc.nextInt();
System.out.println("Enter the value of b");
int b=sc.nextInt();
c1.getDivide(a,b);
}
}
