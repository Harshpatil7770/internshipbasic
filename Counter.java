public class Counter extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
try
{
Thread.sleep(100);
}
catch(Exception e)
{

}
System.out.println(i);
}
}
public static void main(String args[])
{
Counter a1=new Counter();
a1.start();
}
}

