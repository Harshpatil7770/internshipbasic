import java.util.*;
import java.io.IOException;
class Votter
{
public static void main(String args[]) throws IOException
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age");
int age=sc.nextInt();
if(age<18)
{
throw new IOException("Not eligible for votting");
}
else
{
System.out.println("eligible for votting");
}
}
}
