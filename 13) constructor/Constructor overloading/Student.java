class Student
{
String name;
int id;
float marks;
Student(String name,int id)
{
this.name=name;
this.id=id;
}
Student(String name,int id,float marks)
{
this(name,id);
this.marks=marks;
}
void display()
{
System.out.println(name+" "+id+" "+marks);
}
}
class Test
{
public static void main(String args[])
{
Student s1=new Student("Vaishnavi",101,95.f);
Student s2=new Student("Harshawardhan",102,71.55f);
s1.display();
s2.display();
}
}