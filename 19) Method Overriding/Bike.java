class Bike
{
void run()
{
System.out.println("Running....");
}
}
class Honda extends Bike
{
void run()
{
super.run();
System.out.println("Running safe within speed limit 80");
}
public static void main(String args[])
{
Honda a=new Honda();
a.run();
}
}