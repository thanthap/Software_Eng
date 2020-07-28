package Version2;

public class Paper {
    
//Attribute
    public int comID;
    public String text = "";
    public String nameEng = "";

//Constructor
    public Paper(int comID,String text){
        this.comID = comID;
        this.text = text;
    }

//Method
    public void set_nameEng(String nameEng){
        this.nameEng = nameEng;
    }    
}