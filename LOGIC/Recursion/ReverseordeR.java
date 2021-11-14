import java.util.*;
class ReverseordeR
{
public static void main(String args[])
{
List<Integer> list=new ArrayList<>();
list.add(10);
list.add(5);
list.add(20);
list.add(10);
System.out.println(list);
Comaparator c=Collections.reverseOrder();
Collections.sort(c.list);
Iterator itr=list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
]