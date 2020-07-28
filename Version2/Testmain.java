package Version2;

import java.util.ArrayList;

public class Testmain {
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<Room>();
        for (int i = 1; i <= 10; i++) {
            rooms.add(new Room(String.valueOf(" Room "+i)));
        }

        for (int i = 0; i < 9; i++) {
            rooms.get(i).addCom(30);
        }
        rooms.get(9).addCom(43);
        for (Room room : rooms) {
            room.printList();
        }
    }
}