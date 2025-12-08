package prototype;

import prototype.interfaces.Prototype;

public class Wall implements Prototype {


   private Integer longueur;
   private Integer largeur;
   private String couleur;

   public Wall(){}

   public Wall setLongueur(Integer longueur){
       this.longueur = longueur;
       return  this;
   }

   public Wall setLargeur(Integer largeur){
       this.largeur = largeur;
       return this;
   }
   public Wall setCouleur(String couleur){
       this.couleur = couleur;
       return this;
   }

    @Override
    public Prototype clone() {
        return (Prototype) new Wall().setCouleur(this.couleur).setLargeur(this.largeur).setLongueur(this.longueur);
    }

    @Override
    public String toString() {
        return "Wall{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}