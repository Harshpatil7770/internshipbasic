import java.util.*;
class CollectionEx
{
public static void main(String args[])
{
Set<String> set=new LinkedHashSet<>();
set.add("HARSH");
set.add("PATIL");
set.add("HARSH");
set.add("VAISH");
set.add("TARAL");
set.add("HARSH");
set.add("HARSH");
Iterator itr=set.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}