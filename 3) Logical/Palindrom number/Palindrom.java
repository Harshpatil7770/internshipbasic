import java.util.*;
class Palindrom
{
public static void main(String args[])
{
int num;
int rem;
int rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
num=sc.nextInt();
int temp=num;
while(temp!=0)
{
rem=temp%10;
rev=(rev*10)+rem;
temp=temp/10;
}
if(num==rev)
{
System.out.println("Palindrom number");
}
else
{
System.out.println("Not a Palindrom number");
}
}
}
