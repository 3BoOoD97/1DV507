package ad222uk_assign3;

public class NorseGod {
    private String name;
    private String race;
    private String desc;

    public NorseGod(){

    }

    public NorseGod(String a, String b, String c){
        setname(a);
        setRace(b);
        setdesc(c);
    }
    
    public void setname(String name) {
        this.name = name;
    }


    public String getname() {
        return name;
    }

    public void setRace(String race) {
    	race = race;
    }
  
    public String getRace() {
        return race;
    }

    public void setdesc(String desc) {
        this.desc = desc;
    }

    public String getdesc() {
        return desc;
    }

  
}