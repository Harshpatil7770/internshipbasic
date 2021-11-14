class RemoveDuplicate 
{
static int[] getRemoveDuplicate(int a[])
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
int arr[]={30,40,10,10,50,60,80,10,90,30,40};
int a[]=getRemoveDuplicate(arr);
for(int element:a)
{
System.out.println(element);
}
System.out.println();
for(int i=0;i<a.length;i++)
{
for(int j=i+1;i<a.length-1;i++)
{
if(a[i]==a[j])
{

}
else
{
System.out.println(a[i]);
}
}
}
}
}