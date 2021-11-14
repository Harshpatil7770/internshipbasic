class SelectionSorting
{
static int[] getSortedArray(int a[])
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
int arr[]={25,85,4,6,85,9,3,5,245,12};
int a[]=getSortedArray(arr);
System.out.println("Ascending order");
for(int ele:a)
{
System.out.println(ele);
}
}
}
