import java.util.*;
class Factorial
{
int getFactorial(int num)
{
if(num==1)
{
return 1;
}
return num*getFactorial(num-1);
}
public static void main(String args[])
{
Factorial a1=new Factorial();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
a1.getFactorial(num);
System.out.println(a1.getFactorial(num));
}
}