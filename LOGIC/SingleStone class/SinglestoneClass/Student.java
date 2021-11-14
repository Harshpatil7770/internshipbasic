class Student
{
private static Student s=null;
private Student()
{

}
public static Student getInstance()
{
if(s==null)
{
s=new Student();
}
return s;
}
}
class Test
{
public static void main(String args[])
{
Student s1=Student.getInstance();
Student s2=Student.getInstance();
System.out.println(s1==s2);
}
}