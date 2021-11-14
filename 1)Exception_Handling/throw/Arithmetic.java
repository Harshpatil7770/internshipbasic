import java.util.*;
class Votter
{
void eligibleCriteria(int age)
{
if(age<18)
{
thorw new ArithmeticException("Not Valid For Votting");
}
else
{
System.out.println("Valid For Votting");
}
finally
{
System.out.println("Finally block exceuted");
}
}
public static void main(String args[])
{
Votter ac=new Votter();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age");
int age=sc.nextInt();
ac.eligibleCriteria(age);
}
}