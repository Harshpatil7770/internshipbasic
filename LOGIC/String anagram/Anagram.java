import java.util.*;
class Anagram
{
public static void main(String args[])
{
String str1="";
String str2="";
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String1");
str1=sc.next();
System.out.println("Enter the String2");
str2=sc.next();
if(str1.length()!=str2.length())
{
System.out.println("Not A Angram String");
}
char a[]=str1.toCharArray();
Arrays.sort(a);
System.out.println(a);
char b[]=str2.toCharArray();
Arrays.sort(b);
System.out.println(b);
if(Arrays.equals(a,b))
{
System.out.println("Anagram String");
}
else
{
System.out.println("Not A Anagram String");
}
}
}
