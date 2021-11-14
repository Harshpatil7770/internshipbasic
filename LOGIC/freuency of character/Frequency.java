import java.util.*;
class Frequency
{
public static void main(String args[])
{
String str="Welcomee";
Map<Character,Integer> map=new HashMap<>();
for(int i=0;i<str.length();i++)
{
char a=str.charAt(i);
if(map.contaninsKey(a))
{
map.put(a,map.get(a)+1);
}
else
{
map.put(a,1);
}
}
for(Map.Entry e=map.entrySet())
{
System.out.println(e);
}
}
}