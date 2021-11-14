import java.util.*;
import java.io.IOException;
class CheckedExceptionn // Classes Directly inherit from Throwable classes.
{
void m()throws IOException
{
throw new IOException(" A device error");
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
System.out.println(e.getMessage());
}
}
public static void main(String args[])
{
CheckedExceptionn ce=new CheckedExceptionn();
ce.p();
}
}