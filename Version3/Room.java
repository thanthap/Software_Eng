package Version3;

import java.util.ArrayList;

public class Room {
//Attribute
    String RoomName;       //Roomname
    ArrayList<Com> Comlist = new ArrayList<Com>();  //com in Room

//Constructor
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
    public String getName() {                   //get เพื่อเช็ค เราไม่สามารถดึงค่าออกมาได้โดยตรง
        return this.RoomName;                   //set กำหนดค่า
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