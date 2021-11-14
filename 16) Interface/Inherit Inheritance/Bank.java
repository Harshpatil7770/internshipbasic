interface Bank
{
float getRateofInterest();
}
interface Branch extends Bank
{
String getBankname();
}
class SBI implements Branch
{
public float getRateofInterest()
{
return 9.5f;
}
public String getBankname()
{
return "SBI";
}
}
class HDFC implements Branch
{
public float getRateofInterest()
{
return 10.5f;
}
public String getBankname()
{
return "HDFC";
}
public static void main(String args[])
{
SBI a=new SBI();
System.out.println(a.getRateofInterest()+" "+a.getBankname());

HDFC a1=new HDFC();
System.out.println(a1.getRateofInterest()+" "+a1.getBankname());
}
}