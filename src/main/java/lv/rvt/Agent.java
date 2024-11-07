package lv.rvt;

public class Agent {
    private String firstname;
    private String lastname;

    public Agent(String initFirstname, String initLastname){
        this.firstname = initFirstname;
        this.lastname = initLastname; 
    }
    
    public String toString(){
        return"My name is " + this.lastname + ", " + this.firstname + " " + this.lastname; 
    }
}
