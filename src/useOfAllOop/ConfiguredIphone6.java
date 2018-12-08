package useOfAllOop;

public class ConfiguredIphone6 {
    public int materials(int ram, int camera){
        int total = ram+camera+45;
        return total;
    }
    public int materials(int ram, int camera, String processor){
        int value = Integer.parseInt(processor);
        int total = ram+camera+value+58;
        return total;
    }
}
