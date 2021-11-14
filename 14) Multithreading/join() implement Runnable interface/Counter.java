class Counter implements Runnable
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
System.out.println(e);
}
System.out.println(i);
}
}
public static void main(String args[])
{
Counter a1=new Counter();
Thread t1=new Thread(a1);
t1.start();
try
{
t1.join();
}
catch(InterruptedException e)
{
System.out.println(e);
}

Counter c2=new Counter();
Thread t2=new Thread(c2);
t2.start();
Counter c3=new Counter();
Thread t3=new Thread(c3);
t3.start();
}
}