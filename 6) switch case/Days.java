import java.util.*;
class Days
{
public static void main(String args[])
{
String str="yes";
do
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
switch(num)
{
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
case 4:
System.out.println("Thursday");
break;
case 5:
System.out.println("Friday");
break;
case 6:
System.out.println("Saturday");
break;
case 7:
System.out.println("Sunday");
break;
default:
System.out.println("You entered wrong number");
}
System.out.println("Do you want to Continue? 1)yes 2)no");
str=sc.next();
}
while(str.equals("yes"));
}
}