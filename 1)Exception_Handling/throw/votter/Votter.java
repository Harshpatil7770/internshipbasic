import java.util.*;
class Votter
{
static void  getEligible(int age)
{
if(age<18)
{
throw new ArithmeticException("Not eligible for votting");
}
else
{
System.out.println("Eligible for Votting");
}
}
public static void main(String args[]) throws ArithmeticException
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age");
int age=sc.nextInt();
getEligible(age);
}
}