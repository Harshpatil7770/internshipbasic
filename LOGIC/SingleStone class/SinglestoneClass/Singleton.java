class Singleton // we use singleton class to restrict the user from creating the object of class.The main purpose of private constructor to make Single stone class.
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
