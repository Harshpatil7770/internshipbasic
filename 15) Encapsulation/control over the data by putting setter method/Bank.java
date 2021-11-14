interface Bank
{
void getInterest();
}
interface Branch
{
void getBranch();
}
class SBI implements Bank,Branch
{
void getInterest()
{
System.out.println("9.5");
}
void getBranch()
{
System.out.println("SBI");
}
public static void main(String args[])
{
SBI a1=new SBI();
a1.getInterest();
a1.getBranch();
}
}