class Anonymous
{
static int[] getArray()// Array refernce is not used to store the variable 
{
return new int[]{10,20,30,40};
}
public static void main(String args[])
{
int a[]=getArray();
for(int element:a)
{
System.out.println(element);
}
}
}