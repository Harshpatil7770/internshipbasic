import java.util.*;
class Simple
{
public static void main(String args[])
{
List<Integer> list=new ArrayList<>();
list.add(10);
list.add(5);
list.add(20);
list.add(15);
System.out.println(list);
Collections.reverse(list);
Iterator itr=list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}