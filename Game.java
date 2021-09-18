public class Game {
//  private String rank;
  private String gname;
  private int players;

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
    public String getPlayers() {
      return players;
    }
    public void setPlayers(String nplayers){
      this.players = nplayers;
    }
  }

  