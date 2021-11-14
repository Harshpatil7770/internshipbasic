class InvalidVottingException extends Exception
{
InvalidVottingException(String err)
{
super(err);
}
}
class Votter 
{
static void getEligible(int age)throws IOException
{
if(age<18)
{
throw new IOException("Not eligible for Votting");
}
else
{
System.out.println("Eligible for votting");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age");
int age=sc.nextInt();
getEligible(age);
}
}
