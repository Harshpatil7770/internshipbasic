class Method extends Thread
{
public void run()
{
for(int i=0;i<=10;i++)
{
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println(i);
}
}
public static void main(String args[])
{
Method a1=new Method();
a1.start();
Method a2=new Method();
a2.start();
}
}