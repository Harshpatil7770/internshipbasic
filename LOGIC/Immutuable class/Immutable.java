final class Immutable //to make immutable class we need to make class is final,variable is final,and dont use setter method.
{
private static long id;
private String name;
public Immutable(long id,String name)
{
this.id=id;
this.name=name;
System.out.println(id+" "+name);
}
long getId()
{
return id;
}
}
class Test
{
public static void main(String args[])
{
Immutable im=Immutable(101l,"Smith");
}
}


