class Count extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
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
Count c1=new Count();
c1.start();
try
{
c1.join();    // join method wait for thread to die.
}
catch(InterruptedException e)
{
System.out.println(e);
}
Count c2=new Count();
c2.start();
Count c3=new Count();
c3.start();
}
}