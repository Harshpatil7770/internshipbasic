class Simple extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
System.out.println(i);
}
}
public static void main(String args[])
{
Simple a1=new Simple();
a1.start();
Simple a2=new Simple();
a2.start();
}
}