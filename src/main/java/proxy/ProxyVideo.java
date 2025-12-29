package proxy;

public class ProxyVideo implements Video {

    private String fileName;
    private User user;
    private Video reference;

    public ProxyVideo(String fileName, User user ){
        this.fileName = fileName;
        this.user = user;
    }

    @Override
    public void play() {
        if(! user.getIsLogged()){
            System.out.println("vous devez vous connectez");
            return;
        }
        if(! user.getIsPremium()){
            System.out.println("vous n'êtes pas premium");
            return;
        }
        if(reference == null){
            reference = new MP4Video(fileName);
        }
        reference.play();
    }

    @Override
    public void preview() {
        if(! user.getIsLogged()){
            System.out.println("vous devez vous connectez");
            return;
        }
        if(reference == null){
            reference = new MP4Video(fileName);
        }
        reference.preview();
    }

    @Override
    public void show() {
        if(reference == null){
            System.out.println("je charge l'image du proxy");
        }else{
            reference.show();
        }
    }
}
