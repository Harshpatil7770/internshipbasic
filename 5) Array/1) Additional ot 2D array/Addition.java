class Addition
{
public static void main(String args[])
{
int a[][]={{2,3,4},{4,5,6},{5,7,7}};
int b[][]={{7,8,9},{8,6,7},{8,5,7}};
int c[][]=new int[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}