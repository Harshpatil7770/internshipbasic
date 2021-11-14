class ThirdHighest
{
static int[] getSortedarray(int a[])
{
for(int i=0;i<a.length;i++)
{
int temp=0;
for(int j=0;j<a.length-1;j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
return a;
}
public static void main(String args[])
{
int arr[]={25,85,74,96,41,52,63,95,75,46};
int a[]=getSortedarray(arr);
System.out.println("Asending order");
for(int element:a)
{
System.out.println(element);
}
System.out.println("Third higest number");
for(int element:a)
{
System.out.println(a[a.length-3]);
break;
}
}
}