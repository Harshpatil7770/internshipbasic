import java.io.IOException;
class Arithmetic
{
void m() 
{
int c=10/0;
System.out.println(c);
}
void n() throws IOException
{
m();
}
void p() throws IOException
{
n();
}
public static void main(String args[])
{
Arithmetic a1=new Arithmetic();
try
{
a1.p();
}
catch(IOException e)
{
System.out.println(e.getMessage());
}
}
}