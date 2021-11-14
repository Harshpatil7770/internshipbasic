import java.util.*;
class Count
{
public static void main(String args[])
{
Stack<Integer> set=new Stack<Integer>();
set.push(10);
set.push(20);
set.push(30);
set.push(40);
set.remove(2);
Iterator itr=set.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}