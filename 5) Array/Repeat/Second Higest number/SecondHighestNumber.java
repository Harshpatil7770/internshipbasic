class SecondHighestNumber
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
int arr[]={20,30,40,40,80,90,67,30,38,44,454,5345,4,4545,54,244,4,5,45,5,5,45,25,25,345,545,42,5,3423,5,45,52,423,42,45,45,653,53,6,54,523,4,5};
int a[]=getSortedarray(arr);
System.out.println("Ascending order");
for(int element:a)
{
System.out.print(element+" ");
}
System.out.println();
System.out.println("Second Higest number:");
for(int element: a)
{
System.out.println(a[a.length-2]);
break;
}
}
}