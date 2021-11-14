import java.util.*;
class Marks
{
public static void main(String args[])
{
String str="yes";
do
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks");
int marks=sc.nextInt();
if(marks>=0 && marks<35)
{
System.out.println("Fail");
}
else if(marks>=35 && marks<=50)
{
System.out.println("C grade");
}
else if(marks>51 && marks<=70)
{
System.out.println("B grade");
}
else if(marks>=71 && marks<=90)
{
System.out.println("A grade");
}
else if(marks>=91 && marks<=100)
{
System.out.println("A+ grade");
}
else if(marks<=0 || marks>100)
{
System.out.println("Please enter valid marks");
}
System.out.println("Do you want to continue again? 1)yes 2)no");
str=sc.next();
}
while(str.equals("yes"));
}
}