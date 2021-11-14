abstract class Bank
{
String name;
String branch;
abstract float getRateofInterest();
Bank(String name,String branch)
{
this.name=name;
this.branch=branch;
}
void show()
{
System.out.println("Holiday Every Wednesday and Sunday");
}

String IFSCCODE="1800200BOM";
}
class SBI extends Bank
{
SBI(String name,String branch)
{
super(name,branch);
}
float getRateofInterest()
{
return 9.5f;
}
public static void main(String args[])
{
SBI a=new SBI("SBI","MOHOL");
System.out.println(a.name+" "+a.branch+" "+a.IFSCCODE+" "+a.getRateofInterest());
a.show();

}
}