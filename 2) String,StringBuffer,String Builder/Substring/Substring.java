class SubString
{
public static void main(String args[])
{
String str="HELLO JAVA";
System.out.println(str.substring(0,4));
for(int i=0;i<str.length();i++)
{
System.out.println(str.substring(0,str.length()-i));
}
}
}