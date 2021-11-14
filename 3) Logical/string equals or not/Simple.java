import java.util.*;
class Simple
{
void check(String str1,String str2)
{
if(str1.equals(str2))
{
System.out.println("String are equal");
}
else
{
System.out.println("String are not equal");
}
}
}
class Test
{
public static void main(String args[])
{
Simple a=new Simple();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first String");
String str1=sc.next();
System.out.println("Enter the Second String");
String str2=sc.next();
a.check(str1,str2);
}
}