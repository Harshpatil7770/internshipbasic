import java.util.*;
class Count
{
public static void main(String args[])
{
List<Integer> list=new LinkedList<>();
list.add(10);
list.add(20);
list.add(20);
list.add(30);
list.add(40);
System.out.println(list);
list.remove(3);
System.out.println(list);
list.add(70);
System.out.println(list);
ListIterator itr=list.listIterator();
while(itr.hasNext())
{
Integer a=(Integer) itr.next();
if(a==40)
{
itr.remove();
itr.add(50);
itr.set(90);
}
}
System.out.println(list);
}
}
