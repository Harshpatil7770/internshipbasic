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
System.out.println(e);
}
System.out.println(i);
}
}
public static void main(String args[])
{
Count a1=new Count();
a1.start();
Count a2=new Count();
a2.start();
}
}