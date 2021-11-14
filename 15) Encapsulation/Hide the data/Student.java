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
Student s1=new Student();
s1.setName("HARSH");
s1.setId(121);
System.out.println(s1.getName()+" "+s1.getId());
}
}