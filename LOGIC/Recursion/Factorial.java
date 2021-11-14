class Factorial
{
int getFactorial(int num)
{
if(num==1)
{
return 1;
}
return num*getFactorial(num-1);
}
public static void main(String args[])
{
Factorial a1=new Factorial();
a1.getFactorial(5);
System.out.println(a1.getFactorial(5));
}
}