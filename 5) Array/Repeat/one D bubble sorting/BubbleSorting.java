class BubbleSorting 
{
static int[] getSortedArray(int a[])
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
int arr[]={90,80,60,40,50,30,70,20,10};
int a[]=getSortedArray(arr);
System.out.println("Ascending order");
for(int element:a)
{
System.out.println(element);
}
}
}
