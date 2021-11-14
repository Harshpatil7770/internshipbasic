interface Company
{
String getCompanyname();
int MAXSPEED=90;
}
interface TwoWheeler
{
String getModelname();
float getPrice();
}
class HONDA implements Company,TwoWheeler
{
public String getCompanyname()
{
return "HONDA";
}
public String getModelname()
{
return "Shine";
}
public float getPrice()
{
return 98000.f;
}
public static void main(String args[])
{
HONDA a1=new HONDA();
System.out.println(a1.getCompanyname()+" "+a1.getModelname()+" "+a1.getPrice()+ a1.MAXSPEED);
}
}