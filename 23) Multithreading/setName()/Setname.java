class Setname extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getName());
}
public static void main(String args[])
{
Setname a1=new Setname();
a1.setName("Current Thread");// setName() used to change the name of Thread.
a1.start();
}
}