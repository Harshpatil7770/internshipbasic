class Count extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getName());
}
public static void main(String args[])
{
Count c1=new Count();
c1.setName("Current Thread");
c1.start();
}
}