class C extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
try
{
Thread.sleep(-1000);
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
C c1=new C();
c1.start();
}
}