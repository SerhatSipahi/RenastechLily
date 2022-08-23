package code.Day_29_OOP_Inheretence.LoginExample;

public class FacebookLogin {
    private String Username;
    private String Password;

    public void setUsername(String username) {
        this.Username = username;
    }

    public void setPassword(String password) {
        this.Password = password;

    }

    public String getUsername() {
        return this.Username;
    }

    public String getPassword() {
        return this.Password;
    }

    public void OpenBrownser(){
        System.out.println("The Web browser is created");
    }

    public void GotoURL(){
        System.out.println("Facebook.com url is navigated");
    }
    public String AddUsername(String username){
        System.out.println("The User name added ");
        return "No error Occured";

    }

    public String AddPassword(String password){
        System.out.println("The password is added ");
        return "No error Occured";

    }

    public void ClickLogin(){
        System.out.println("Login is successful");
    }

    public void CloseBrowser(){
        System.out.println("Browser is closed");
    }
}
