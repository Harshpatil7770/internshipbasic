import java.util.*;
class Sum
{
public static void main(String args[])
{
int num;
int rem;
int rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the num");
num=sc.nextInt();
while(num!=0)
{
rem=num%10;        //125 125%10 12.5 5+2
rev=rev+rem;
num=num/10;
}
System.out.println(rev);
}
}
