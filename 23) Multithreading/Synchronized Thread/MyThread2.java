class MyThread2 extends Thread
{
Sender s;
MyThread2(Sender s)
{
this.s=s;
}
void send()
{
s.send("HELLO");
}
}