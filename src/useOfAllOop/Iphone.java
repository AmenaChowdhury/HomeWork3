package useOfAllOop;

public class Iphone extends Bose implements Phone, MIT{

    private int priceOfRam; //private variable is used for encapsulation
    private String futureName;
    private char quality;
    private boolean madeInUsa;

    public Iphone(){
        System.out.println("From default constructor");
    }
    public Iphone(int priceOfRam, String futureName, char quality, boolean madeInUsa) {
        this.priceOfRam = priceOfRam;
        this.futureName = futureName;
        this.quality = quality;
        this.madeInUsa = madeInUsa;
    }

    public int getPriceOfRam() {
        return priceOfRam;
    }
    public void setPriceOfRam(int priceOfRam) {
        this.priceOfRam = priceOfRam;
    }
    public String getFutureName() {
        return futureName;
    }
    public void setFutureName(String futureName) {
        this.futureName = futureName;
    }
    public char getQuality() {
        return quality;
    }
    public void setQuality(char quality) {
        this.quality = quality;
    }
    public boolean isMadeInUsa() {
        return madeInUsa;
    }
    public void setMadeInUsa(boolean madeInUsa) {
        this.madeInUsa = madeInUsa;
    }

    public static void retinaDisplay(){
        System.out.println("Retina Display is first introduce by Iphone Inc");
    }

    public void calling() {
        System.out.println("Screen Touch calling button is available");
    }
    public void messaging() {
        System.out.println("We have Imessage for Iphone user only ");
    }
    public void camera() {
        System.out.println("The best resolution camera belongs to us");
    }

    public void speakerMaterials() {
        System.out.println("Bose doesn't disclose it");
    }

    public void noiseCancelling() {
        System.out.println("Bose had a lab in Princeton where they are improving noise cancelling technology");
    }
    public void cyberSecurity() {
        System.out.println("MIT is supporting Iphone for Cyber security");
    }
}
