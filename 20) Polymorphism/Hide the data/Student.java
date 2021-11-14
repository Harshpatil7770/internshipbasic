class Student
{
private String name;
private int id;
public void setName(String name)
{
this.name=name;
}
public void setId(int id)
{
this.id=id;
}
public String getName()
{
return name;
}
public int getId()
{
return id;
}
}
class Test
{
public static void main(String args[])
{
Student s=new Student();
s.setName("HARSH");
s.setId(101);
System.out.println(s.getName()+" "+s.getId());
}
}
