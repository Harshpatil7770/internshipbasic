class Counter implements Runnable
{
public void run()
{
for(int i=0;i<=10;i++)
{
try
{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println(e.getMessage());
}
System.out.println(i);
}
}
public static void main(String args[])
{
Counter c1=new Counter();
c1.run();
Counter c2=new Counter();
c2.run();
}
}