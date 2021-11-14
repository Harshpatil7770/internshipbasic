import java.util.*;
class Reverse
{
public static void main(String args[])
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
num=sc.nextInt();
int rem,rev=0;
int temp=num;
while(temp!=0)
{
rem=temp%10;
rev=(rev*10)+rem;
temp=temp/10;
}
System.out.println(rev);
}
}