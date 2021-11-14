class Fabonaci
{
public static void main(String args[])
{
int a=0;
int b=1;
int c;
System.out.println(0);
System.out.println(1);
for(int i=0;i<10;i++)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}
