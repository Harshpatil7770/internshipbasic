class Add
{
public static void main(String args[])
{
int a[][]={{2,8,9},{4,5,3},{2,3,5}};
int b[][]={{4,5,3},{6,7,4},{3,4,6}};
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