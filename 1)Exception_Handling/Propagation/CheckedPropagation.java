import java.io.IOException;
import java.util.*;
class CheckedPropagation 
{
void m()throws IOException
{
throw new IOException("A device error");
}
void n() throws IOException
{
m();
}
void p()throws IOException
{
n();
}
public static void main(String args[])
{
CheckedPropagation a1=new CheckedPropagation();
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