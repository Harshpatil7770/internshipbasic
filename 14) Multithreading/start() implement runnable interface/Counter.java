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
Counter a2=new Counter();
Thread t2=new Thread(a2);
t2.start();
}
}