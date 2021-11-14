import java.util.*;
class Palindrom
{
String str1="";
String getReverse(String str)
{
for(int i=str.length()-1;i>=0;i--)
{
str1+=str.charAt(i);
}
if(str1.equals(str))
{
System.out.println("Palindrom String");
}
else
{
System.out.println("Not Palindrom String");
}
return str;
}
public static void main(String args[])
{
Palindrom a1=new Palindrom();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String str=sc.next();
a1.getReverse(str);
}
}
