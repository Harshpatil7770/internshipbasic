import java.util.*;
class Collection
{
public static void main(String args[])
{
ArrayList<String> list=new ArrayList<String>();
list.add("HARSH");
list.add("Ram");
list.add("PATIL");
Iterator itr=list.iterator(); // it is used for traversing operation
while(itr.hasNext()) // if more element are present it return true and return false no element in it.
{
String str=(String) itr.next();  // return element and cursor comes to next element
if(str.equals("Ram"))
{
itr.remove();
}
}
System.out.println(list);
}
}