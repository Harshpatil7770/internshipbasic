class NewSplit
{
public static void main(String args[])
{
String str="Hello java world";
String world[]=str.split("\\s");
for(String element:world)
{
System.out.println(element);
}
}
}