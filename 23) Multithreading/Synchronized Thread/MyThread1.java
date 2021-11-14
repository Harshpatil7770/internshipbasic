class MyThread1 extends Thread
{
Sender s;
MyThread(Sender s)
{
this.s=s;
}
void send()
{
s.send("HI");
}
}