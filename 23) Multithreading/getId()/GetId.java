class GetId extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getId());
}
public static void main(String args[])
{
GetId a1=new GetId();
a1.start();
GetId a2=new GetId();
a2.setDaemon(true);
a2.start();
}
}