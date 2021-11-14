class StringToChar
{
public static void main(String args[])
{
String str="HELLO JAVA";
char a[]=new char[str.length()];
for(int i=0;i<a.length;i++)
{
a[i]=str.charAt(i);
System.out.println(a[i]);
}
}
}