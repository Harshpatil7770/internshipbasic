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
int arr[]={20,30,10,40,50,60,70,90,40,80};
int a[]=getSortedArray(arr);
System.out.println("Asending Order");
for(int element:a)
{
System.out.println(element);
}
}
}