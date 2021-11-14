class Person
{
String name;
int id;
Person(String name,int id)
{
this.name=name;
this.id=id;
}
}
class Employee extends Person
{
float salary;
Employee(String name,int id,float salary)
{
super(name,id);
this.salary=salary;
}
}
class Manager extends Employee
{
float bonus;
Manager(String name,int id,float salary,float bonus)
{
super(name,id,salary);
this.bonus=bonus;
}
public static void main(String args[])
{
Manager a1=new Manager("HARSHAWARDHAN",101,98000f,10000f);
System.out.println(a1.name+" "+a1.id+" "+a1.salary+" "+a1.bonus);
}
}