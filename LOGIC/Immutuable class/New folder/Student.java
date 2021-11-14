final class Student
{
private final String name; //make class is final .variable is final and do not use setter method
private final long id;
Student(String name,long id)
{
this.name=name;
this.id=id;
}
public String getName()
{
return name;
}
public long getId()
{
return id;
}
}
class Test
{
public static void main(String args[])
{
Student s1=new Student("HARSH",101);
System.out.println(s1.getName()+" "+s1.getId());
}
}