class Counter extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
try{
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
Counter c1=new Counter();
Counter c2=new Counter();
c1.start();
c2.start();
}
}