import java.util.*;
class RemoveDuplicate
{
public static void main(String args[])
{
List<Integer> list=new ArrayList<>();
list.add(10);
list.add(20);
list.add(40);
list.add(80);
list.add(10);
list.add(20);
list.add(10);
list.add(40);
list.add(80);
System.out.println(list);
Set<Integer> set=new TreeSet<>();
Iterator itr=set.iterator();
set.addAll(list);
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}