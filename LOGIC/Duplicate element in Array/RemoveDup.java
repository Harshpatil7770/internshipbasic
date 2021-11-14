class RemoveDup
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
int arr[]={12,25,85,75,46,12,89,25,46,85};
int a[]=getSortedarray(arr);
System.out.println("Ascending order");
for(int element:a)
{
System.out.println(element);
}
System.out.println("After RemoveDuplicatr");
{
for(int i=0;i<a.length-1;i++)
if(a[i]==a[i+1])
{

}
else
{
System.out.println(a[i]);
}
}
}
}