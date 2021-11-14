import java.util.*;
class InvalidVottingException extends Exception
{
InvalidVottingException(String err)
{
super(err);
}
}
class Votter
{
static void getEligible(int age) throws InvalidVottingException
{
if(age<18)
{
throw new InvalidVottingException("Not eligible for votting");
}
else
{
System.out.println("Eligible for votting");
}
}
public static void main(String args[]) throws InvalidVottingException
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age");
int age=sc.nextInt();
getEligible(age);
}
}