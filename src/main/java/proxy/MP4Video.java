package proxy;

public class MP4Video implements Video{

    private String fileName;

    public MP4Video(String fileName){
        this.fileName = fileName;
        System.out.println("je charge la video source");
    }
    @Override
    public void play() {
        System.out.println("montre la video source ");
    }

    @Override
    public void preview() {
        System.out.println("charge la video de 1 min avec acces limité");
    }

    @Override
    public void show() {
        System.out.println("charge l'image de la video");
    }
}
