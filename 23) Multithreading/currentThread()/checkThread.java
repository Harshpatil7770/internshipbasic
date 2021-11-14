class CheckThread extends Thread
{
CheckThread(String name)
{
super(name);
}
public void run()
{
System.out.println(Thread.currentThread().getName()+" is exucuting");
}
public static void main(String args[])
{
CheckThread a1=new CheckThread("Current Thread");
a1.start();
CheckThread a2=new CheckThread("Daemon Thread");
a2.start();
}
}