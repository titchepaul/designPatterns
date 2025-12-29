package proxy;

public class MyMain {

    public static void main(String[] args) {
        User user1 = new User("Paul","polo", true);
        User user2 = new User("Toto", "toto", false);

        Video v1 = new ProxyVideo("linkYoutub", user1);
        Video v2 = new ProxyVideo("link", user2);

        user1.login();
        user2.login();

        v1.preview();
        v1.play();
        v1.show();
        System.out.println("-------------------");
        v2.play();
        v2.show();
        v2.preview();
    }
}
