@FunctionalInterface
interface Bike
{
void run();
}
class Honda implements Bike
{
public void run()
{
System.out.println("Running safely within speed limit 60km/hr");
}
public static void main(String args[])
{
Honda h1=new Honda();
h1.run();
}
}
/*java 1.8 added the new feature Function interafce
* Function Interface means it has only one abstract method.
* @FunctionalInterface annonation will provide in 1.8 i.e when any one try to add new method it will show compile time error. */