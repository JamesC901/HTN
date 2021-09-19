import java.util.ArrayList;

public class Game {

  private ArrayList<String> Ranks;
  private String gname;
  private int players;
  private ArrayList<String> Roles;

  public Game(String gname, int players) {
    this.gname = gname;
    this.players = players;
  }
    public String getGname() {
      return gname;
    }
    public void setGname(String ngname) {
      this.gname = ngname;
    }

 /*   public String getRank() {
      return rank;
    }
    public void setRank(String nrank) {
      this.rank = nrank;
    }
*/
    public int getPlayers() {
        return players;
    }
    public void setPlayers(String nplayers){
        this.players = players;
    }
  }

  