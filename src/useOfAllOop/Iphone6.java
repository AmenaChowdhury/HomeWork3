package useOfAllOop;

public class Iphone6 extends Iphone5 {
    public void smartMap(){
        System.out.println("Smart map can recognize your destination with giving any direction");
    }
    public int materials(int ram, int camera){
        int total = ram+camera;
        return total;
    }
    public int materials(int ram, int camera, String processor){
        int value = Integer.parseInt(processor);
        int total = ram+camera+value;
        return total;
    }
}
