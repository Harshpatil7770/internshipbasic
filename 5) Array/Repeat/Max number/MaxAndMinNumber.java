class MaxAndMinNumber
{
public static void main(String args[])
{
int a[]={10,20,30,40,50,460,9,0,4,32,2,24,13,245,56,7676,454,45,6435,356,65,5,744,555,6546,3,56,45,534,4355,556,45,55,45,5,65,5565,554,554,676,777,2,77,567,66,4126,6565,66,767,4565,6};
int min=a[0];
int max=a[0];
int temp=0;
for(int i=1;i<a.length;i++)
{
if(min>a[i]) 
{
min=a[i];
}
}
System.out.println("Minimun Number"+min);
for(int i=0;i<a.length;i++)
{
if(max<a[i])
{
max=a[i];
}
}
System.out.println("Maximum Number"+max);
}
}