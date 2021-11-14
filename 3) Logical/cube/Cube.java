class Cube
{
int getCube(int a)
{
return a*a*a;
}
public static void main(String args[])
{
Cube a=new Cube();
a.getCube(3);
System.out.println(a.getCube(3));
}
}