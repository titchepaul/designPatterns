package proxy;

public class User {

    private String name;
    private String password;
    private Boolean isPremium = false;
    private Boolean isLogged = false;

    public  User(String name, String password, Boolean isPremium) {
        this.name = name;
        this.password = password;
        this.isPremium = isPremium;
    }

    public void login(){
        isLogged = true;
    }
    public void logout(){
        isLogged = false;
    }
    public Boolean getIsPremium(){
        return isPremium;
    }
    public Boolean getIsLogged(){
        return isLogged;
    }
}
