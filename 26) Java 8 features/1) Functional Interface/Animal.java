//Fuctional Interface
@FunctionalInterface
interface Animal
{
void eat();
}
class Dog implements Animal
{
public void eat()
{
System.out.println("Eating...");
}
}
class Cat implements Animal
{
public void eat()
{
System.out.println("Drinking....");
}
}
class Test
{
public static void main(String args[])
{
Dog d1=new Dog();
d1.eat();
Cat d2=new Cat();
d2.eat();
}
}
/* In java 1.8 add new feature i.e Functional Interface
* Functional Interface means it has only one abstarct method
* @FucntionalInterface annonation used to restrict the user from creating more than one method inside the Interface
* function interface defined in stream and itearable interface.
*/