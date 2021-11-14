class MulThreadingEx extends Thread
{
public void run()
{
System.out.println("Run method started Executing");
}
public static void main(String args[])
{
MulThreadingEx a1=new MulThreadingEx();
System.out.println("Run Method is running Before Started the Start method "+a1.isAlive());
a1.start();
System.out.println("Run method is running After started the start method  "+a1.isAlive());
}
}