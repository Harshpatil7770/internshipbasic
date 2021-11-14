import java.util.l
class Prime
{
public static void main(String num)
{
int num;
int temp=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the num");
num=sc.nextInt();
if(num==0 || num==1)
{
System.out.println("Not A Prime number");
}
else
{
for(int i=2;i<num/2;i++)
{
if(num%i!=0)
{
System.out.println("Prime number");
temp=1;
break;
}
}
if(temp==0)
{
Syste.out.println("Not a Prime number");
}
}
}
}