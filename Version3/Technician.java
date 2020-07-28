package Version3;

import java.util.ArrayList;

public class Technician {

//Attribute
    String name;     //name Engineer
    ArrayList<Com> FixList = new ArrayList<Com>();  //list for call eng to fix com

//Construcor
    public Technician(String name) {                
        this.name=name;
    }
    public void addFix(Com com) {
        this.FixList.add(com);
    }
    public ArrayList<Com> get_FixList() {
        return this.FixList;
    }
    public void Fix_() {
        
    }
}