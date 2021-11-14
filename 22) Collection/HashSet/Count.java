import java.util.*;
class Count
{
public static void main(String args[])
{
Set<Integer> set=new HashSet<>();
set.add(10);
set.add(20);
set.add(30);
set.add(10);
set.add(20);
set.add(30);
set.size();
System.out.println(set);
System.out.println(set);
set.remove(30);
System.out.println(set);
}
}