import java.util.*;
import java.util.stream.Collectors;
class Team
{
private String name;
private int rank;
Team(String name,int rank)
{
this.name=name;
this.rank=rank;
}
public String getName()
{
return name;
}
public int getRank()
{
return rank;
}
public String toString()
{
return "Name: "+name+" Rank "+rank;
}
}
class Test
{
public static void main(String args[])
{
List<Team> list=Arrays.asList(new Team("India",1),new Team("China",7),new Team("Newzland,3),new Team("Singapure",2),new Team("Jermany",5),new Team("Itely",6));
List<Team> qualifyTeam=list.stream().filter((e) -> e.getRank()<=4).sorted(Collector.comparingInt(Team::getRank)).collect(Collectors.toList());
System.out.println("Qualify Team");
System.out.println(qualifyTeam):
}
}
