class Bubble
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
int arr[]={25,85,98,74,52,63,15,95,75};
int a[]=getSortedarray(arr);
for(int element:a)
{
System.out.print(element+" ");
}
}
}