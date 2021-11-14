class Maximum
{
public static void main(String args[])
{
int a[]={78,85,25,14,74,96,63,35,57,85,15,96,89,45};
int max=a[0];
for(int i=1;i<a.length-1;i++)
{
if(max<a[i])
{
max=a[i];
}
}
System.out.println("MAX NUMBER IS"+max);
}
}
