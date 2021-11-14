class Prime
{
public static void main(String [] args)
{
int num;
int temp=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the num");
 num=sc.nextInt();
if(num==1 || num==2)
{
System.out.println("Not Prime number");
}
else
{
for(int i=2;i<=num/2;i++)
{
if(num%i==0)
{
System.out.println("Not a Prime number");
}
}
if(temp==0)
{
System.out.println(" Primenumber");
}
}
}
}
