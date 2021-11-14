class Simple
{
public static void main(String args[])
{
String s="XYZ";
String s1="XYZ";
String s2=new String("XYZ");
if(s==s1)                  //true == is boolean operator used for refernce(address) comparision.
{
System.out.println("True");
}
else
{
System.out.println("False");
}
if(s==s2)                 //false  
{
System.out.println("true");
}
else
{
System.out.println("false");
}
if(s2.equals(s1))         //true equals method is used for content comaparision.
{
System.out.println("true");
}
else
{
System.out.println("false");
}
}
}
