import java.io.IOException;
class Counter
{
void display() throws IOException
{
throw new IOException("A Device error");
}
void get()throws IOException
{
 display();
}
void show()
{
try
{
get();
}
catch(IOException e)
{
System.out.println(e);
}
}
public static void main(String args[])
{
Counter c1=new Counter();
c1.show();
}
}