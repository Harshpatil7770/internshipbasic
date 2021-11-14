class Anonymous
{
static int[] getAnonymous()
{
return new int[]{3,4,2,3,7,9,7};
}
public static void main(String args[])
{
int a[]=getAnonymous();
for(int element:a)
{
System.out.println(element+" ");
}
}
}