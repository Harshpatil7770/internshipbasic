import java.util.*;
import java.util.stream.Collectors;
class StreamAPI
{
public static void main(String args[])
{
List<Integer> list=Arrays.asList(10,20,25,85,74,86,68,89,56,23,12,45,78,85,52);
List<Integer> odd=list.stream().filter((e)-> e%2!=0).collect(Collectors.toList());
System.out.println("Printing odd Numbers");
System.out.println(odd);
}
}