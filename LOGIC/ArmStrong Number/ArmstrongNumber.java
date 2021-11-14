import java.util.*;
class ArmstrongNumber
{
public static void main(String args[])
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
num=sc.nextInt();
int temp=num;
int rem,rev=0;
while(temp!=0)
{
rem=temp%10;
rev=(rev)+rem*rem*rem;
temp=temp/10;
}
System.out.println("now the num becomes "+rev);
if(num==rev)
{
System.out.println("ArmStrong Number");
}
else
{
System.out.println("Not Armstrong Number");
}
}
}