import java.util.*;
class Count
{
public static void main(String args[])
{
List<Integer> list=new ArrayList<Integer>();
list.add(10);
list.add(20);
list.add(30);
list.add(30);
list.add(20);
list.add(3);
Iterator itr=list.iterator();
while(itr.hasNext())
{
Integer a1=(Integer) itr.next();
if(a1==20)
{
itr.remove();
}
}
System.out.println(list);
List<String> list1=new ArrayList<>();
list1.add("HARSH");
list1.add("Patil");
list1.add("Mohol");
System.out.println(list1);
list1.remove("Patil");
System.out.println(list1);
System.out.println(1);
list1.clear();
System.out.println(list1);
}
}