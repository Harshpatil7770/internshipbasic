class Student
{
String name;
int id;
static String collegeName="SAE";
Student(String name,int id)
{
this.name=name;
this.id=id;
}
static void change()
{
collegeName="Sangmeshwar";
}
}
class Test
{
public static void main(String args[])
{
Student s1=new Student("HARSHAWARDHAN",101);
Student s2=new Student("Vaishnavi",102);
Student.change();
System.out.println(s1.name+" "+s1.id+" "+Student.collegeName);
System.out.println(s2.name+" "+s2.id+" "+Student.collegeName);
}
}