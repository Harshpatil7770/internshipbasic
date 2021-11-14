import java.util.*;
class RemoveDuplicate
{
public static void main(String args[])
{
List<Integer> list=new ArrayList<>();
list.add(10);
list.add(20);
list.add(10);
list.add(10);
list.add(30);
list.add(70);
list.add(40);
System.out.println(list);
Set<Integer> list1=new LinkedHashSet<>();
list1.addAll(list);
Iterator<Integer> itr=list1.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}