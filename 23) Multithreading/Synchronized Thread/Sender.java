class Sender 
{
public synchronized void send(String str)
{
System.out.println("Sending Message...."+str);
try
{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println(e.getMessage());
}
System.out.println(" Send "+str);
}

}