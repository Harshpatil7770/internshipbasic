import java.util.*;
import java.util.stream.Collectors;
class EvenNum
{
public static void main(String args[])
{
List<Integer> list=Arrays.asList(10,25,58,74,41,63,96,85,25,36,14,47,58,69,46,13,79,56,23,12,45,78,96,63,41,52,85,74,96,63,52,14);
List<Integer> even=list.stream().filter((e)-> e%2==0).collect(Collectors.toList());
System.out.println("Even Number");
System.out.println(even);
}
}
/* Lambda expression is new feature added in java 1.8
*  Lambda expression is used to provide implementation of Functional interface.
*  also it reduce the no. of code.
*  when we use Lambda expresssion we do need to write method again for the implmenation.
*  Lambda expression treaded as function so jvm does not create its class file
*  Syntax
*(argument List)-> {Body}
* argument list- argument list may be empty or not.
* arrow token- arrow token used to link the between argument list and body.
* BodY- Body contains expression or statement
* NO Parameter()->{ }
* 1 parameter (p1)->{ }
* 2 paramater (p1,p2)->{ } 
*/