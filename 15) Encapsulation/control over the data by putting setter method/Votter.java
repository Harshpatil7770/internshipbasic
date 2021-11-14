class Votter
{
int age;
public void setAge(int age)
{
if(age<18)
{
System.out.println("Not eligible for votting");
}
else
{
System.out.println("Eligible for votting");
}
}
}
class Test
{
public static void main(String args[])
{
Votter v1=new Votter();
v1.setAge(17);
}
}