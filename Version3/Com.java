package Version3;

public class Com {
    private static int num = 0;
    private int id;
    private boolean isWorking;

    public Com(){
        this.id=++num;
        this.isWorking=true;
    }
    public int get_id() {
        return this.id;
    }
    public boolean get_status() {
        return this.isWorking;
    }
    public void fix() {
        this.isWorking = true;
    }
}