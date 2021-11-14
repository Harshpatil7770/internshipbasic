class Arithmetic
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
Arithmetic a=new Arithmetic();
try
{
a.p();
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}
}