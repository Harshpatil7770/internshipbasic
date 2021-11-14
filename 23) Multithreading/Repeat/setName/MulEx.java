class MulExample extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getName());
}
public static void main(String args[])
{
MulExample a1=new MulExample();
a1.setName("Current Thread1");
a1.start();
MulExample a2=new MulExample();
a2.setName("Current Thread2");
a2.start();
}
}