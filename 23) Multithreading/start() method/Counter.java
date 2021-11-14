class Counter implements Runnable
{
public void run()
{
for(int i=0;i<=10;i++)
{
try
{
Thread.sleep(1000);// Threadclass  is static 
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
Thread t1=new Thread(c1);
t1.start();
}
}