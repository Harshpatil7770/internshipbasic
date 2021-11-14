class Normal extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getName());
System.out.println(Thread.currentThread().getPriority());
}
public static void main(String args[])
{
Normal a1=new Normal();
a1.setPriority(NORM_PRIORITY);
a1.start();
}
}