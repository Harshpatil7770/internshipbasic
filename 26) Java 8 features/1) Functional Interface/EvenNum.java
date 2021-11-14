import java.util.*;
import java.util.stream.Collectors;
class EvenNum
{
public static void main(String args[])
{
List<Integer> list=Arrays.asList(10,25,58,74,41,63,96,85,25,36,14,47,58,69,46,13,79,56,23,12,45,78,96,63,41,52,85,74,96,63,52,14};
List<Integer> even=list.stream().filter((e)-> e%2==).collect(Collectors.toList());
System.out.println("Even Number");
System.out.println(even);
}
}