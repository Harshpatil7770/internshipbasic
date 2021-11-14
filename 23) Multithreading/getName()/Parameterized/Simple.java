class Simple extends Thread
{
Simple(String name)
{
super(name);
}
public void run()
{
System.out.println(Thread.currentThread().getName());
}
public static void main(String args[])
{
Simple a1=new Simple("Current Thread 1");
a1.start();
Simple a2=new Simple("Current Thread 2");
a2.start();
}
}c