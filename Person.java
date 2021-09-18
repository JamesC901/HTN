import java.util.ArrayList;

public class Person {

  private String uname = "";
  private String fname = "";
  private ArrayList<Game> games;
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
  
  public Person(String uname, String fname, ArrayList<Game> games, String pronouns, int age, ArrayList<Person> friends, String dtag) {
    this.uname = uname;
    this.fname = fname;
    this.pronouns = pronouns;
    this.age = age;
    this.friends = friends;
    this.dtag = dtag;
  } 
  
  public Person(String uname, String fname, ArrayList<Game> games, String pronouns, int age, String dtag) {
    this.uname = uname;
    this.fname = fname;
    this.games = games;
    this.pronouns = pronouns;
    this.age = age;
    this.dtag = dtag;
  } 
  
  public void addFriends(Person friend) {
    friends.add(friend);
  } 
  
  public void removeFriends(Person friend) {
    friends.remove(friend);
 }
  
  
  public static void main (String args[]) {
    ArrayList<Game> s = new ArrayList<Game>();
    
        
    Person a = new Person();
    Person b = new Person("James Chen","James Chen", s, " ", 1, " ");
    
    a.addFriends(b);
    
    System.out.println(a.friends.get(0).fname);
    
  }
  
  
}
