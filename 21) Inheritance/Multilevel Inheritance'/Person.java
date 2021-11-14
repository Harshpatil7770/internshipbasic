class Person
{
String name;
String companyName;
Person(String name, String companyName)
{
this.name=name;
this.companyName=companyName;
}
}
class Employee extends Person
{
float salary;
Employee(String name,String companyName,float salary)
{
super(name,companyName);
this.salary=salary;
}
}
class Manager extends Employee
{
float bonus;
Manager(String name,String companyName,float salary, float bonus)
{
super(name,companyName,salary);
this.bonus=bonus;
}
}
class Test
{
public static void main(String args[])
{
Manager a=new Manager("HARSH","HRP",98800f,12000f);
System.out.println(a.name+" "+a.companyName+" "+a.salary+" "+a.bonus);
}
}
