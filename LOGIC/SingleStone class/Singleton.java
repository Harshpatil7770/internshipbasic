class Singleton
{
public static Singleton single=null;
private Singleton()
{

}
public static Singleton getInstance()
{
if(single==null)
{
single=new Singleton();
}
return single;
}
}
class Test
{
public static void main(String args[])
{
Singleton s1=Singleton.getInstance();
Singleton s2=Singleton.getInstance();
System.out.println(s1==s2);
}
}