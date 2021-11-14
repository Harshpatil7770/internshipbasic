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
try
{
a1.join();
}
catch(InterruptedException e)
{

}
Count c2=new Count();
c2.start();
Count c3=new Count();
c3.start();
Count c4=new Count();
c4.start();
}
}