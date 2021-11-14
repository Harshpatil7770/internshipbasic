class Recursive
{
String getReverse(String str)
{
if(str.isEmpty())             //Hello
{
return str;
}
System.out.println(str.charAt(str.length()-1));
return getReverse(str.substring(0,str.length()-1));
}
public static void main(String args[])
{
Recursive a1=new Recursive();
a1.getReverse("Hello");
}
}