class UncheckedPropagation 
{
void m()
{
int a=10/0;
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
 UncheckedPropagation a1=new UncheckedPropagation();
try
{
a1.p();
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}
} 