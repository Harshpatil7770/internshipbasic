class Counter 
{
static void getDivide()
{
try
{
int c=10/0;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
catch(Exception e)
{
System.out.println(e);
}
finally
{
System.out.println("Rest of the code...");
}
}
public static void main(String args[])
{
getDivide();
}
}