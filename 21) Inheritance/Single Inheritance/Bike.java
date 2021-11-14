class Bike
{
void run()
{
System.out.println("Running.....");
}
}
class Honda extends Bike
{
void run()
{
super.run();
System.out.println("Running safely within speed limit 60km");
}
}
class Test
{
public static void main(String args[])
{
Honda  a1=new Honda();
a1.run();
}
}  