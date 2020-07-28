package Version3;

import java.util.ArrayList;
public class testmain {
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<Room>();
        for (int i = 0; i < 10; i++) {
            rooms.add(new Room(String.valueOf(100+i)));     //Create Room 1-10
        }

        for (int i = 0; i < 9; i++) {                       //addCom 30 ea to Room 1-9
            rooms.get(i).addCom(30);
        }
        rooms.get(9).addCom(43);                            //addCom 43 ea to Room 10
        for (Room room : rooms) {
            room.printList();
        }
    }
}