class Simple extends Thread
{
public void run()
{
for(int i=0;i<=10;i++)
{
try
{
Thread.sleep(4000);
}
catch(InterruptedExpection e)
{
System.out.println(e.getMessage());
}
System.out.println(i);
}
}
public static void main(String args[])
{
Simple a=new Simple();
a.start();
}
}