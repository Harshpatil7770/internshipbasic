class StaticBlock
{
String name;
int id;
static 
{
System.out.println("Company name-HRP PVt.ltd");
}
StaticBlock(String name,int id)
{
this.name=name;
this.id=id;
}
}
class Test
{
public static void main(String args[])
{
StaticBlock a=new StaticBlock("HARSH",101);
System.out.println(a.name+" "+a.id);
StaticBlock b=new StaticBlock("Vaish",102);
System.out.println(b.name+" "+b.id);
}
}
