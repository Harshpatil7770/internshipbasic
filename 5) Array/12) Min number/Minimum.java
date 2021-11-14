class Minimum
{
public static void main(String args[])
{
int a[]={78,89,56,58,96,74,54,85,63,96,72};
int min=a[0];
for(int i=1;i<a.length-1;i++)
{
if(min>a[i])
{
min=a[i];
}
}
System.out.println("Min number"+min);
}
}