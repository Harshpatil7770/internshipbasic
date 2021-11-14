import java.util.*;
class Addition
{
int getAdd(int a,int b)
{
int e;
return e=a+b;
}
int getAdd(int a,int b,int c)
{
int d;
return d=a+b+c;
}
}
class Test
{
public static void main(String args[])
{
Addition a1=new Addition();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the values of a:");
int a=sc.nextInt();
System.out.println("Enter the values of b:");
int b=sc.nextInt();
System.out.println("Enter the values of c:");
int c=sc.nextInt();
a1.getAdd(a,b);
a1.getAdd(a,b,c);
System.out.println(a1.getAdd(a,b));
System.out.println(a1.getAdd(a,b,c));
}
}