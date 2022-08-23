package code.Day_29_OOP_Inheretence.LoginExample;

public class TESTClass {

    public static void main(String[] args) {
        FacebookLogin log = new FacebookLogin();
        log.setPassword("Handsome_0989");
        log.setUsername("Cevdet0219");
        log.OpenBrownser();
        log.GotoURL();
        //System.out.println(log.getUsername());
        //System.out.println(log.getPassword());
        String uname = log.getUsername();
        //String pword = log.getPassword();

        System.out.println(log.AddUsername(uname));
        System.out.println(log.AddPassword(log.getPassword()));

        log.ClickLogin();
        log.CloseBrowser();

        System.out.println("_______________________________________-");

        CromeFabookLogin crlog = new CromeFabookLogin();
        crlog.setPassword("Serdar_@2343");
        crlog.setUsername("Serder1212");
        System.out.println("The password: " +crlog.getPassword());
        System.out.println("The Username: "+crlog.getUsername());
        crlog.OpenBrownser();


    }
}
