class Student
{
String name;
int id;
static float marks=71.55f;
Student(String name,int id)
{
this.name=name;
this.id=id;
}
static void changeMarks()
{
 marks=71.50f;
}
}
class Test
{
public static void main(String args[])
{
Student s=new Student("HARSH",101);
Student s1=new Student("Vaish",102);
Student.changeMarks();
System.out.println(s.name+" "+s.id+" "+Student.changeMarks());
System.out.println(s1.name+" "+s1.id+" "+Student.changeMarks());

}
}
