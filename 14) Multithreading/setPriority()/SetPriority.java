class SetPriority extends Thread
{
String name;
SetPriority(String name)
{
super(name);
}
public void run()
{
System.out.println(Thread.currentThread().getName());
System.out.println(getPriority());
}
public static void main(String args[])
{
SetPriority a1=new SetPriority("Current Thread");
a1.setPriority(Thread.MIN_PRIORITY);
a1.start();
}
}