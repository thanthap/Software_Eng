package Version2;

import java.util.ArrayList;

public class Room {
    
    String RoomName;
    ArrayList<Com> Comlist = new ArrayList<Com>();
    public Room(String Name) {
        this.RoomName=Name;
    }
    public Room(String Name,int n) {
        this.RoomName=Name;
        for (int i = 0; i < n; i++) {
            this.Comlist.add(new Com());
        }
    }
    public void addCom(int n) {
        for (int i = 0; i < n; i++) {
            this.Comlist.add(new Com());
        }
    }
    public String getName() {
        return this.RoomName;
    }
    public ArrayList<Com> getList(){
        return this.Comlist;
    }
    public void printList() {
        System.out.println("--------"+this.RoomName+"--------------");
        for (Com com : Comlist) {
            System.out.println(com.get_id());
        }
    }
}