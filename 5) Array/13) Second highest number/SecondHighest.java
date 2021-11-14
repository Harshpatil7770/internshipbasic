class SecondHighest
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
int arr[]={25,85,74,96,15,95,35,75,85,56};
int a[]=getSortedarray(arr);
System.out.println("Asecnding order");
for(int element:a)
{
System.out.println(element);
}
System.out.println("Second largest number");
for(int element:a)
{
System.out.println(a[a.length-2]);
break;
}
}
}

