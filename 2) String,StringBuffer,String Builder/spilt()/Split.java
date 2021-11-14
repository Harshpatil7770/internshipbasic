class Split
{
public static void main(String args[])
{
String str="Hello Java wrold";
String world[]=str.split("\\s");
for(String element:world)
{
System.out.println(element);
}
}
}