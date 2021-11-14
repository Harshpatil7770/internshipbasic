class Check extends Thread
{
public void run()
{
System.out.println("Method is runnning"+isAlive());
}
public static void main(String args[])
{
Check c1=new Check();
System.out.println("BEfore start the method() Thread is Run "+c1.isAlive());
c1.start();
System.out.println("After the start method() "+c1.isAlive());
}
}
