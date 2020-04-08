
public class User {
    
   private String name = new String();
   private int word ;
   private int wrong;
   public User ( int word, int wrong )
   {
       
   }
   
    public String getName() {
        return name;
    }

    public int getWord() {
        return word;
    }

    public int getWrong() {
        return wrong;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWord(int word) {
        this.word = word;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", word=" + word + ", wrong=" + wrong + '}';
    }
   
}
