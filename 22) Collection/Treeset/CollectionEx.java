import java.util.*;
class CollectionEx
{
public static void main(String args[])
{
Set<Integer> set=new TreeSet<>();
set.add(10);
set.add(50);
set.add(90);
set.add(50);
set.add(60);
set.add(40);
for(Integer a:set)
{
System.out.println(a);
}
}
}
