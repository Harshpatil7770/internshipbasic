class Student
{
String name;
int id;
Student(String name,int id)
{
this.name=name;
this.id=id;
}
Student(Student c)
{
name=c.name;
id=c.id;
}
void display()
{
System.out.println(name+" "+id);
}
}
class Test
{
public static void main(String args[])
{
Student s=new Student("Vaish",101);
Student s1=new Student(s);
s.display();
s1.display();
}
}
