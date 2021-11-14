import java.util.*;
class Votter
{
int age;
void setAge(int age)
{
if(age<18)
{
System.out.println("Not eligible for votting");
}
else
{
System.out.println("eligible for votting");
}
}
}
class Test
{
public static void main(String args[])
{
Votter a1=new Votter();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age");
int age=sc.nextInt();
a1.setAge(age);
}
}