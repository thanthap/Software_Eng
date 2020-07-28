package Version2;


public class Com {

//Attribute 
    public int comID;
    private static int numCom = 1;     //use varible togerthr

    
//Constructor
    public Com(){
        this.comID = numCom++;
    }

//Method
    public int get_id(){
        return this.comID;
    }
}