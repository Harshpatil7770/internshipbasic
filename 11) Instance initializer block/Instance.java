class Instance
{
String name;
int id;
Instance(String name,int id)
{
this.name=name;
this.id=id;
}
{
System.out.println("Infosys");
}
}
class Test
{
public static void main(String args[])
{
Instance a=new Instance("HARSH",101);
Instance b=new Instance("VAish",102);
System.out.println(a.name+" "+a.id);
System.out.println(b.name+" "+b.id);
}
}


