
import java.io.IOException;
class InvalidVottingException extends Exception
{
InvalidVottingException(String err)
{
super(err);
}
}
class Votter 
{
 void getEligible(int age)throws IOException
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
Votter a1=new Votter();
try
{
a1.getEligible(17);
}
catch(IOException e)
{
System.out.println(e);
}
}
}
