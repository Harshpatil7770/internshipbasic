class Getname extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getName()); // getName() used to get the number of Thread.
}
public static void main(String args[])
{
Getname g1=new Getname();
g1.start();
}
}