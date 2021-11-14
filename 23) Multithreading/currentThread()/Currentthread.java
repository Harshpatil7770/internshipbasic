class Currentthread extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getName()); // current Thread return the currently exucting Thread.
}
public static void main(String args[])
{
Currentthread t1=new Currentthread();
t1.start();
}
}