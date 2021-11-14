import java.util.*;
class ReverseOrder
{
public static void main(String args[])
{
ArrayList<Integer> list=new ArrayList<>();
list.add(10);
list.add(70);
list.add(30);
list.add(20);
System.out.print(list);
System.out.println("Printing Reverse Order");
Comparator c=Collections.reverseOrder();
Collections.sort(list,c);
Iterator itr=list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}