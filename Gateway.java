import java.util.ArrayList;

public class Gateway {
  
  String[] userList;

  Game Fortnite = new Game("Fortnite", 0);
  Game COD = new Game("Warzone", 0);
  Game League = new Game("League of Legends", 0);
  Game Apex = new Game("Apex Legends", 0);
  Game Valorant = new Game("Valorant", 0);
  Game CounterStrike = new Game("CSGO", 0);
  Game Overwatch = new Game("Overwatch", 0);
  Game Among = new Game("Among Us", 0);
  Game Minecraft = new Game("Minecraft", 0);

  //Valorant
  static ArrayList<String> ValorantRanks = new ArrayList<String>();
  static ArrayList<String> ValorantRoles = new ArrayList<String>();


  //League of Legends
  static ArrayList<String> LeagueRanks = new ArrayList<String>();







  public static void main (String args[]){
    //Valorant
    ValorantRanks.add("Iron I");
    ValorantRanks.add("Iron II");
    ValorantRanks.add("Iron III");
    ValorantRanks.add("Bronze I");
    ValorantRanks.add("Bronze II");
    ValorantRanks.add("Bronze III");
    ValorantRanks.add("Silver I");
    ValorantRanks.add("Silver II");
    ValorantRanks.add("Silver III");
    ValorantRanks.add("Gold I");
    ValorantRanks.add("Gold II");
    ValorantRanks.add("Gold III");
    ValorantRanks.add("Platinium I");
    ValorantRanks.add("Platinium II");
    ValorantRanks.add("Platinium III");
    ValorantRanks.add("Diamond I");
    ValorantRanks.add("Diamond II");
    ValorantRanks.add("Diamond III");
    ValorantRanks.add("Immortal I");
    ValorantRanks.add("Immortal II");
    ValorantRanks.add("Immortal III");
    ValorantRanks.add("Radiant");

    ValorantRoles.add("Sentinel");
    ValorantRoles.add("Duelist");
    ValorantRoles.add("Initiator");
    ValorantRoles.add("Controller");


    LeagueRanks.add("Iron IV");
    LeagueRanks.add("Iron III");
    LeagueRanks.add("Iron II");
    LeagueRanks.add("Iron I");
    LeagueRanks.add("Bronze I");
    LeagueRanks.add("Bronze II");
    LeagueRanks.add("Bronze III");
    LeagueRanks.add("Bronze IV");
    LeagueRanks.add("Silver IV");
    LeagueRanks.add("Silver III");
    LeagueRanks.add("Silver II");
    LeagueRanks.add("Silver I");
    LeagueRanks.add("Gold IV");
    LeagueRanks.add("Gold III");
    LeagueRanks.add("Gold II");
    LeagueRanks.add("Gold I");

  }




}