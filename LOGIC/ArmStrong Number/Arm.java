import java.util.*;
class Arm
{
public static void main(String args[])
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
num=sc.nextInt();
int temp=num;
int rev=0,rem;
while(temp!=0)
{
rem=temp%10;
rev=rev+rem*rem*rem;
temp=temp/10;
}
System.out.println("Now the number Becomes"+rev);
if(num==rev)
{
System.out.println("Armstrong Number");
}
else
{
System.out.println("Not a ArmStrong Number");
}
}
}