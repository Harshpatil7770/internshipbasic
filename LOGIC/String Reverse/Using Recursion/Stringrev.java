class Stringrev
{
String getReverse(String str )
{
if(str.isEmpty())
{
return str;
}
System.out.println(str.charAt(str.length()-1));
reurn getReverse(str.substring(0,str.length()-1));
}
public static void main(String args[])
{
Stringrev a1=new Stringrev();
a1.getReverse("Patil");
}
}