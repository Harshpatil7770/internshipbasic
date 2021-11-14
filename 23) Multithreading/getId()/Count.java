class Count extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getId());
}
public static void main(String args[])
{
Count c1=new Count();
c1.start();
Count c2=new Count();
c2.start();
}
}