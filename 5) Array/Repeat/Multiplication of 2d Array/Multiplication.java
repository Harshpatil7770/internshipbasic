class Multiplication 
{
public static void main(String args[])
{
int a[][]={{3,5,6},{3,4,2},{1,4,7}}; //3*3 i=3
int b[][]={{2,3},{5,6},{8,9}}; //3*2 j=2 
int c[][]=new int[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<2;j++)
{
for(int k=0;k<3;k++)
{
c[i][j]=a[i][k]+b[k][j];
}
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
} 