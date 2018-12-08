package useOfAllOop;

public interface Phone {

    public void calling();
    public void messaging();
    public void camera();
    public static void battery(){
        System.out.println("This is from static method");
    }
    public default void wireless(){
        System.out.println("This is default static method");
    }
}
