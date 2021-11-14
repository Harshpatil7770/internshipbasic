class Count extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
try
{
Thread.sleep(1000);// Thread class static.
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
Count c2=new Count();
c2.start();
}
}