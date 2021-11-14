import java.io.IOException;
class Count
{
void m()throws IOException
{
throw new IOException("Input error");
}
void n() throws IOException
{
m();
}
void p()
{
try
{
n();
}
catch(IOException e)
{
System.out.println(e);
}
}
public static void main(String args[]) 
{
Count c1=new Count();
c1.p();
}
}
