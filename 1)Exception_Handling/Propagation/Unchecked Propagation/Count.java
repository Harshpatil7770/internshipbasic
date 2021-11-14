class Count
{
void m()
{
int c=1/0;
}
void n()
{
m();
}
void p()
{
n();
}
public static void main(String args[])
{
Count c1=new Count();
try
{
c1.p();
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}
}