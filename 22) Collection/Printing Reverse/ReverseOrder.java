import java.util.*;
class ReverseOrder
{
public static void main(String args[])
{
List<Integer> list=new ArrayList<Integer>();
list.add(10);
list.add(30);
list.add(50);
System.out.println(list);
Collections.reverse(list);
Iterator itr=list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}