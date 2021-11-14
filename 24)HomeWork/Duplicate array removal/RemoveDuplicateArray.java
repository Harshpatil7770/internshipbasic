class RemoveDuplicateArray
{
static int[] removeDuplicate(int a[])
{
for(int i=0;i<a.length;i++)
{
int temp=0;
for(int j=i+1;j<a.length-1;j++)
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
int arr[]={10,20,30,40,50,60,10,40,90,40,20};
int a[]=removeDuplicate(arr);
for(int i=0;i<a.length-1;i++)
{
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