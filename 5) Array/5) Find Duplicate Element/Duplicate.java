class Duplicate
{
static int[] findDuplicate(int a[])
{
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
{
System.out.print(a[i]);
break;
}
}
}
return a;
}
public static void main(String args[])
{
int arr[]={25,85,74,85,25,69,78,36,85};
int a[]=findDuplicate(arr);
}
}