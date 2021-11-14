import java.util.*;
class RecursionString
{
String getReverse(String str)
{
if(str.isEmpty())
{
return str;
}
System.out.println(str.charAt(str.length()-1));
return getReverse(str.substring(0,str.length()-1));
}
public static void main(String args[])
{
RecursionString a=new RecursionString();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String");
String str=sc.next();
a.getReverse(str);
}
}