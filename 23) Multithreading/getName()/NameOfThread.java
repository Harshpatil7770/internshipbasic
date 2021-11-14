class NameOfThread extends Thread
{
NameOfThread(String name)
{
super(name);
}
public void run()
{
System.out.println(Thread.currentThread().getName());
}
public static void main(String args[])
{
NameOfThread a1=new NameOfThread("Current Thread");
a1.start();
NameOfThred a2=new NameOfThread("Daemon Thread");
a2.setDaemon(true);
a2.start();
}
}