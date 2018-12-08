package useOfAllOop;

public class TestPhone {
    public static void main(String[] args) {
        Phone ph = new Iphone(); //default constructor Initialized
        ph.calling(); //Abstract method Initialized
        ph.messaging();
        ph.camera();
        ph.wireless();
        Phone.battery(); //Static method Initialized

        Iphone ip = new Iphone();
        ip.calling(); //void method Initialized
        ip.messaging();
        ip.camera();

        Iphone.retinaDisplay(); //Static method Initialized

        ip.speakerWeight();
        ip.speakerMaterials();

        ip.setPriceOfRam(359);
        ip.setFutureName("iphoneX");
        ip.setQuality('A');
        ip.setMadeInUsa(false);
        System.out.println("Private Variable is initialized here. "+"Ram price: "+ip.getPriceOfRam()+", Future Name: "+ip.getFutureName()+", Quality: "+ip.getQuality()+" Made In USA: "+ip.isMadeInUsa());

        //Parameterized constructor Initialized
        Iphone ipc = new Iphone(300, "iphoney", 'B', true);
        System.out.println("Private variable is used in Constructor: "+"Price: "+ipc.getPriceOfRam()+", Name: "+ipc.getFutureName()+", Quality: "+ipc.getQuality()+", Made In USA: "+ipc.isMadeInUsa());

        ip.noiseCancelling();

        ip.cyberSecurity();

        Bose bs = new Iphone();
        bs.speakerWeight();
        bs.speakerMaterials();
        bs.noiseCancelling();


        Iphone2 ip2 = new Iphone2();
        ip2.map();
        ip2.calling();
        ip2.messaging();
        ip2.camera();
        ip2.speakerWeight();
        ip2.speakerMaterials();
        ip2.wireless();
        ip2.noiseCancelling();
        ip2.cyberSecurity();

        Iphone4 ip4 = new Iphone4();
        ip4.improvedMap();
        ip4.calling();
        ip4.messaging();
        ip4.camera();
        ip4.speakerWeight();
        ip4.speakerMaterials();
        ip4.wireless();
        ip4.noiseCancelling();
        ip4.cyberSecurity();

        PrincetonUniversity pu = new Iphone();
        pu.noiseCancelling();

        Iphone5 ip5 = new Iphone5();
        ip5.superMap();
        ip5.improvedMap();
        ip5.calling();
        ip5.messaging();
        ip5.camera();
        ip5.speakerWeight();
        ip5.speakerMaterials();
        ip5.wireless();
        ip5.noiseCancelling();
        ip5.cyberSecurity();

        Iphone6 ip6 = new Iphone6();
        ip6.smartMap();
        ip6.superMap();
        ip6.improvedMap();
        ip6.calling();
        ip6.messaging();
        ip6.camera();
        ip6.speakerWeight();
        ip6.speakerMaterials();
        ip6.wireless();
        ip6.noiseCancelling();
        ip6.cyberSecurity();

        MIT mit = new Iphone();
        mit.cyberSecurity();

        Iphone6 ip6a = new Iphone6();
        System.out.println("Total price for 2 configuration of Iphone6: "+ip6a.materials(217,195));
        Iphone6 ip6b = new Iphone6();
        System.out.println("Total price for 3 configuration of Iphone6: "+ip6b.materials(217,195, "78"));

        ConfiguredIphone6 cip6a = new ConfiguredIphone6();
        System.out.println("Total price for 2 configuration of ConfiguredIphone6: "+cip6a.materials(217,195));
        ConfiguredIphone6 cip6b = new ConfiguredIphone6();
        System.out.println("Total price for 3 configuration of ConfiguredIphone6: "+cip6b.materials(217,195, "78"));
// Iphone2 inherit Iphone, Iphone4 inherit Iphone --- Hierarchical Inheritance
// Iphone6 inherit Iphone4 inherit Iphone 2 inherit Iphone --- multilevel Inheritance
// Iphone2 inherit Iphone--- single Inheritance
//Iphone  -- super Class
//// Iphone2, Iphone4, Iphone 5, Iphone 6 --- sub class



    }

}
