class StringRev
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
StringRev a=new StringRev();
a.getReverse("Hello");
}
}