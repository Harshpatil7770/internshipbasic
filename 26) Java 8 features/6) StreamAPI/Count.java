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
/* In java 1.8 added the new feature i.e StreamAPI
* stream means does not store the data.
* stream means element flows from source to the desitination.
* In stream element visited only once in the life of stream.
* you can use stream with filter,printing,collect that is changing datastructure one from to another form.*/