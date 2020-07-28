package Version1;

import java.util.ArrayList;

public class Room extends Com{

// Attribute
private String roomID;
private ArrayList<Com> coms;

//Constructor
public Room(String comID,String status,String sym,String roomID,ArrayList<Com> coms){
    super(comID,status,sym);
    this.roomID = roomID;
    this.coms = coms;
}


@Override
public void Addcom(String comID)
    {
        comID = "0001";
        roomID = "room_1";
    
    }

    
}