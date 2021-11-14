import java.util.*;
class Anagram
{
public static void main(String args[])
{
String str="";
String str1="";
Scanner sc=new Scanner(System.in);
System.out.println("Enter The first String :");
str=sc.next();
System.out.println("Enter The Second String :");
str1=sc.next();
System.out.println("Length of The first String is :"+str.length());
System.out.println("Length of The Second String is :"+str1.length());
if(str.length()!=str1.length())
{
System.out.println("Not a Anagram");
}
char a[]=new char[str.length()];
char b[]=new char[str1.length()];
Arrays.sort(a);
Arrays.sort(b);
if(Arrays.equals(a,b))
{
System.out.println("Anagram String");
}
else
{
System.out.println("Not a Anagram String");
}
}
}