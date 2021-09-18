
import java.util.ArrayList;

public class Person {


  private String uname = "";
  private String fname = "";
  private Game games;
  private String pronouns = "";
  private int age;
  ArrayList<Person> friends = new ArrayList<Person>();
  private String dtag = "";


  public Person(){
    uname = "";
    fname = "";
    pronouns = "";
    age = 0;
    dtag = "";
  }

  public Person(String uname, String fname, Game games, String pronouns, int age, ArrayList<Person> friends, String dtag) {
    this.uname = uname;
    this.fname = fname;
    this.games = games;
    this.pronouns = pronouns;
    this.age = age;
    this.friends = friends;
    this.dtag = dtag;
  }




}