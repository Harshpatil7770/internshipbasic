import java.util.*;
class Anagramstring
{
public static void main(String args[])
{
String str1="";
String str2="";
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String 1");
str1=sc.next();
System.out.println("Enter the second 2");
str2=sc.next();
System.out.println("Length of String 1  "+str1.length());
System.out.println("Length of String 2  "+str2.length());
if(str1.length()!=str2.length())
{
System.out.println("Not a AnagramString ");
}
char a[]=str1.toCharArray();
Arrays.sort(a);
System.out.println(a);
char b[]=str2.toCharArray();
Arrays.sort(b);
System.out.println(b);
if(Arrays.equals(a,b))
{
System.out.println("Anagaram String");
}
else
{
System.out.println("Not Anamgram String");
}
}
}
