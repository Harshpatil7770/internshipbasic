class DuplicateElement
{
public static void main(String args[])
{
int a[]={25,85,74,41,25,46,36,96,79,46,35};
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i]==a[j])
{
System.out.print(a[i]+" ");
}
}
}
}
}