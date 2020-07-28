package Version1;

public class Com{

//Attribute
public String comID;
public String status;
public String sym;

    public Com(String comID,String status,String sym){
        this.comID = comID;
        this.status = status;
        this.sym = sym;
    }

    public void Repair(String comID,String sym){
        comID = "";
        sym = "";
        status = "Good";
    }
    public void Addcom(String comID){

    }
}