class Simple
{
int count=0;
void display()
{
if(count<=10)
{
System.out.println("Hello");
count++;
display();
}
}
public static void main(String args[])
{
Simple s=new Simple();
s.display();
}
} 
