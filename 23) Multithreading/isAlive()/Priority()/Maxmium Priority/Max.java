class Max extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getPriority());
System.out.println(Thread.currentThread().getName());
}
public static void main(String args[])
{
Max a1=new Max();
a1.setPriority(MAX_PRIORITY);
a1.start();
}
}