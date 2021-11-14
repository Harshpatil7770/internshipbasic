@FunctionalInterface
interface Bike
{
void run();
}
class Honda 
{
public static void run()
{
System.out.println("Running...");
}
}
class Bajaj
{
public static void run()
{
System.out.println("Running safely within speed limit 60km/hr");
}
}
class Test
{
public static void main(String arg[])
{
Bike b1=Honda::run;
b1.run();
Bike b2=Bajaj::run;
b2.run();
}
}
/* In java 1.8 added new feature method refernce
* Method refernce used to refers the method of functional Interface.
* It is compact and easy to use.
* it has three types
* refernce to static method,refernce to instacne method,reference to constructor.*/