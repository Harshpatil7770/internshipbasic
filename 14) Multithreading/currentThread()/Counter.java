class Counter extends Thread
{
public void run()
{
System.out.println(Thread.currentThread());
}
public static void main(String args[])
{
Counter c1=new Counter();
c1.start();
}
}