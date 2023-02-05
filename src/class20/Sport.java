package class20;

import org.w3c.dom.ls.LSOutput;

public class Sport {
    String name;
    String country;

    Sport(String name, String country){
        this.name=name;
        this.country=country;
    }
    public void display(){
        System.out.println(name+" is in "+country);
    }

}
class Cricket extends Sport{
    String helmet;
    Cricket(String name,String country, String helmet){
        super(name,country);
        this.helmet=helmet;

    }

}
class Soccer extends Sport{
    String team;
    int numberOfPlayers;
    Soccer(String name, String country,String team,int numberOfPlayers){
        super(name,country);
        this.team=team;
        this.numberOfPlayers=numberOfPlayers;

    }
    void displayTeam(){
        System.out.println(team+" consist of "+numberOfPlayers+" players");
    }
}