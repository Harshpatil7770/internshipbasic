import java.util.*;
class PrimeNum
{
public static void main(String args[])
{
int num;
int temp=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
 num=sc.nextInt();
if(num==0 || num==1)
{
System.out.println("Not a Prime Number");
}
else
{
for(int i=2;i<num/2;i++)
{
if(num%i==0)
{
System.out.println(" Not a Prime Number");
temp=0;
break;
}
}
if(temp==1)
{
System.out.println("Prime Number");
}
}
}
}
