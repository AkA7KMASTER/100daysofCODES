
/*
Task
Complete the code in your editor by writing an overridden getNumberOfTeamMembers method that prints the same
statement as the superclass' getNumberOfTeamMembers method, except that it replaces n with 11 
(the number of players on a Soccer team).

Output Format

When executed, your completed code should print the following:

Generic Sports
Each team has n players in Generic Sports
Soccer Class
Each team has 11 players in Soccer Class
*/

class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
}
public class MethodOverriding{
    public static void main(String[] args) {
        Sports s1 = new Sports();
        Soccer s2 = new Soccer();
        System.out.println(s1.getName());
        s1.getNumberOfTeamMembers();
        System.out.println(s2.getName());
        s2.getNumberOfTeamMembers();
    }
}
