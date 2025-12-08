package prototype;

public class Main {

    public static void main(String[] args){
        Wall w1 = new Wall().setLongueur(100).setLargeur(200).setCouleur("Rouge");
        Wall w2 =  ((Wall)w1.clone()).setLongueur(20).setLargeur(50).setCouleur("Vert");
        Wall w3 = ((Wall) w2.clone()).setLargeur(11).setCouleur("Blanc");

        System.out.println("w1 : " + w1);
        System.out.println("w2 : " + w2);
        System.out.println("w3 : " + w3);
        System.out.println();

        Room r1 = new Room().setId(1).addWall(w1).addWall(w2);
        Room r2 = ((Room) r1.clone()).setId(2).addWall(w1);
        Room r3 = ((Room) r2.clone()).setId(3).addWall(w3);
        Room r4 = ((Room) r3.clone()).setId(4).addWall(w3);

        System.out.println("r1 : " + r1);
        System.out.println("r2 : " + r2);
        System.out.println("r3 : " + r3);
        System.out.println("r4 : " + r4);
        System.out.println();

        Floor f1 = new Floor().setId(1).addRoom(r1);
        Floor f2 = ((Floor) f1.clone()).setId(2).addRoom(r2);
        Floor f3 = ((Floor) f2.clone()).setId(3).addRoom(r3);
        Floor f4 = ((Floor) f3.clone()).setId(4).addRoom(r3);
        Floor f5 = ((Floor) f4.clone()).setId(5).addRoom(r4);

        System.out.println("------------Code Output---------");

        System.out.println("f1 : " + f1);
        System.out.println("f2 : " + f2);
        System.out.println("f3 : " + f3);
        System.out.println("f4 : " + f4);
        System.out.println("f5 : " + f5);
    }
}
