import java.util.*;
class Bike
{
private String name;
private String model;
private double price;
private long id;
public void setId(long id)
{
this.id=id;
}
public void setName(String name)
{
this.name=name;
}
public void setModel(String model)
{
this.model=model;
}
public void setPrice(double price)
{
this.price=price;
}
public String getName()
{
return name;
}
public String getModel()
{
return model;
}
public long getId()
{
return id;
}
public double getPrice()
{
return price;
}
public String toString()// toString() is object class Method. to String() method returnn the string represenation od an object.
{
return "Name: "+name+"Model: "+model+"Id: "+id+"Price: "+price;
}
}
class Test
{
public static void main(String args[]) 
{
Bike b1=new Bike();
b1.setName("Honda");
b1.setModel("Shine");
b1.setId(101l);
b1.setPrice(90000.00);
b1.getName();
b1.getModel();
b1.getId();
b1.getPrice();
List<Bike> list=new ArrayList<Bike>();
list.add(b1);
}
}