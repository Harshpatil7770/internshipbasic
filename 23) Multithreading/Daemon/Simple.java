class Simple extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().isDaemon());
}
public static void main(String args[])
{
Simple s1=new Simple();
s1.start();
Simple s2=new Simple();
s2.setDaemon(true);
s2.start();
}
}