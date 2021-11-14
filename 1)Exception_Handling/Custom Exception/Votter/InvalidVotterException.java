import java.util.*;
class InvalidVotterException extends Exception
{
InvalidVotterException(String err)
{
super(err);
}
}
class Votter 
{
void getEligible(int age) throws InvalidVotterException
{
if(age<18)
{
throw new InvalidVotterException("Not Valid For Votting");
}
else
{
System.out.println("Valid for Votting");
}
}
public static void main(String args[])
{
Votter a1=new Votter();
Scanner sc=new Scanner(System.in);
System.out.println("Enter The age");
int age=sc.nextInt();
try
{
a1.getEligible(age);
}
catch(InvalidVotterException e)
{
System.out.println(e.getMessage());
}
}
}