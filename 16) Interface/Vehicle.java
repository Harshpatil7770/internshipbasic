interface Vehicle
{
String getName();
int getModel();
int SPEEDLIMIT=60;
}
interface FourWheeler extends Vehicle
{
float getPrice();
}
class Honda implements FourWheeler
{
public String getName()
{
return "HONDA SHINE";
}
public int getModel()
{
return 2015;
}
public float getPrice()
{
return 98000.f;
}
public static void main(String args[])
{
Honda h1=new Honda();
System.out.println(h1.getName()+" "+h1.getPrice()+" "+h1.getModel()+" "+h1.SPEEDLIMIT);
}
}