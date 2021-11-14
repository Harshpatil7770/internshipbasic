import java.io.IOException;
class Simple
{
void m() throws IOException
{
throw new IOException("A device error");
}
void n() throws IOException
{
m();
}
void p() throws IOException
{
n();
}
public static void main(String args[]) throws IOException
{
Simple a1=new Simple();
try
{
a1.p();
}
catch(IOException e)
{
System.out.println(e);
}
}
}
