class ThirdHigNum
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
int arr[]={23,3,434,333,443,344,45,35454,455,45,45,3,43,45,5,2,43,4,324,543,3243,43,432,434,3,432,43,5,454,35,4646,767,7,676,67,7,656,6,566,56,6,54,5,5,65,6,5,5,46,};
int a[]=getSortedarray(arr);
System.out.println("Ascending order");
for(int element:a)
{
System.out.println(element+" ");
}
System.out.println("Third Highest Number");
for(int element:a)
{
System.out.println(a[a.length-3]);
break;
}
}
}