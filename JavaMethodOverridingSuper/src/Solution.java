/**
  * https://www.hackerrank.com/challenges/java-method-overriding
  */

import java.util.*;


class Sports{

    String getName(){
        return "Generic Sports";
    }
  
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    int TEAM_MEMBERS = 11;
    
    @Override
    String getName(){
        return "Soccer Class";
    }
    
    @Override
    void getNumberOfTeamMembers(){
      String output = String.format("Each team has %1$d players in %2$s", 
                                    TEAM_MEMBERS, getName());
      System.out.println(output);
    }
}

public class Solution{
  
    public static void main(String []args){
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
  }
}
