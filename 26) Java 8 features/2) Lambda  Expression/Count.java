class Count
{
public static vodi main(String args[])
{
List<Integer> list=Arrays.asList(10,25,85,74,96,63,52,41,75,85,96,25,36,58);
list.forEach((e)-> System.out.println(e));
}
}
/* In java 1.8 added new feature i.e Lambda Expression
* It is used to provide implemenation of functional interface.
* also it need to write a less code.
* Lamnda expression used with functioanl interface only
*Lambda interafce treated as function so jvm does not create class.
* Syntax
* (argumenst list)-> { method body}
1) Arguement list= It may be empty or not empty
2) Arrow token= Its is used link between Argumment list and method body.
3) Method body= Method body contains statements and expression.
*/
 