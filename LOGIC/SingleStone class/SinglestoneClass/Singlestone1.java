class Singlestone1
{
public static Singlestone1 singlestone=null;
private Singlestone1()
{

}
public static Singlestone1 getInstance()
{
if(singlestone==null)
{
singlestone=new Singlestone1();
}
return singlestone();
}
}
class Test
{
public static void main(String args[])
{
Singlestone s1=Singlestone1.getInstance();
Singlestone s2=Singlestone1.getInstance();
System.out.println(s1==s2);
}
} 