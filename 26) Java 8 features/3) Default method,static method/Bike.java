interface Bike
{
default void run()
{
System.out.println("running...");
}
}
class Honda implements Bike
{
public void run()
{
Bike.super.run();
System.out.println("Running safely within speed limit 60km/hr");
}
}
class Bajaj implements Bike
{
public void run()
{
System.out.println("Bajaj avgenger is good for long running");
}
}
class Suzuki implements Bike
{
public void run()
{
Bike.super.run();
System.out.println("Suzuki XYZ model has more demand in market");
}
}
class Test
{
public static void main(String arg[])
{
Suzuki a1=new Suzuki();
a1.run();
Bajaj a2=new Bajaj();
a2.run();
Honda a3=new Honda();
a3.run();
}
}
/* In java 1.8 defalut method added in interface as new features.
*  We know that in java 1.7 we have only method definition in interafce.
* And whenever we need to new method we should compulsory to provide implementaion of that method in all classes, so which are neccesary increase our work without any use.
* so in java 1.8 we add deafult interface into the interface and which class want to access it access by interfacename_super_methodname.
*/