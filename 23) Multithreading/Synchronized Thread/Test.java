class Test
{
public static void main(String args[])
{
Sender s=new Sender();
MyThread1 t1=new MyThread1(s);
t1.start();
MyThread2 t2=new MyThread2(s);
t2.start();
}
}