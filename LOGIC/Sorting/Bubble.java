class Bubble
{
static int[] getSortedArray(int a[])
{
for(int i=0;i<a.length-1;i++)
{
int temp=0;
for(int j=0;j<a.length;j++)
{
if(a[i]>a[i+1])
{
temp=a[i];
a[i]=a[i+1];
a[i+1]=temp;
}
}
}
return a;
}
public static void main(String args[])
{
int arr[]={12,25,85,96,63,44,45,65};
int a[]=getSortedArray(arr);
System.out.println("Ascending order");
for(int ele:a)
{
System.out.println(ele);
}
}
}
