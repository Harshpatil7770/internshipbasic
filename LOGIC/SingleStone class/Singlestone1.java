class Singlestone1
{
private Singlestone1()
{

}
static public Singlestone1 getInstance()
{
return new Singlestone1();
}
}
class Test
{
public static void main(String args[])
{
Singlestone1 s1=Singlestone1.getInstance();
Singlestone1 s2=Singlestone1.getInstance();
System.out.println(s1==s2);
}
}