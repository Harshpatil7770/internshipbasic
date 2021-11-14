import java.io.IOException;
class Count
{
void m() throws IOException
{
throw new IOException(" A device Error");
}
void n()throws IOException
{
m();
}
void p()throws IOException
{
n();
}
public static void main(String args[])
{
Count c1=new Count();
try
{
c1.p();
}catch(IOException e)
{
System.out.println(e);
}
}
}
