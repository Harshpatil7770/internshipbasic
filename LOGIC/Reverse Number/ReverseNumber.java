import java.util.*;
class ReverseNumber
{
public static void main(String args[])
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The number");
int rem,rev=0;
num=sc.nextInt();
while(num!=0)
{
rem=num%10;
rev=(rev*10)+rem;
num=num/10;
}
System.out.println("The reverse number is"+rev);
}
}