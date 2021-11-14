class SecondHig 
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
int arr[]={43,85,96,74,52,63,41,52,63,85,52};
int a[]=getSortedArray(arr);
System.out.println("Ascending order");
for(int ele:a)
{
System.out.println(ele);
}
System.out.println("Second Highest Number");
for(int ele:a)
{
System.out.println(a[a.length-2]);
break;
}
}
}