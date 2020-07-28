package Version3;


//******เอาไว้รับค่า comID , อาการ ให้กับช่างแล้ว ช่างจะเซ็นชื่อ */
public class FixOrder {
//Attribute
    public int comID;
    public String text = "";
    public String nameEng = "";

//Constructor
    public FixOrder(int comID,String text){
        this.comID = comID;
        this.text = text;
    }

//Method
    public void set_nameEng(String nameEng){
        this.nameEng = nameEng;
    }  
    
}