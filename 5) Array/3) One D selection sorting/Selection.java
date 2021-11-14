class Selection
{
static int[] getSortedarray(int a[])
{
for(int i=0;i<a.length;i++)
{
int temp=0;
for(int j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
return a;
}
public static void main(String args[])
{
int arr[]={25,56,85,78,96,74,45,56};
int a[]=getSortedarray(arr);
for(int element:a)
{
System.out.print(element+" ");
}
}
}