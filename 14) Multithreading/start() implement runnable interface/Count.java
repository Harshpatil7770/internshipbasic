class Count implements Runnable
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
Count c1=new Count();
Thread t1=new Thread(c1);
t1.start();
Count c2=new Count();
Thread t2=new Thread(c2);
t2.start();
}
}