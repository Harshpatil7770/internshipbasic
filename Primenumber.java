import java.util.Scanner;
class Primenumber
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number do ypu want to check whether prime or not");
int num=sc.nextInt();
int temp=0;
if(num==0 || num==1)
{
System.out.println("Not a prime number");
}
else
{
for(int i=2;i<=num/2;i++)
{
if(num%i==0)
{
System.out.println("Not a Prime Number");
temp=1;
break;
}
}
if(temp==0)
{
System.out.println("Prime Number");
}
}
}