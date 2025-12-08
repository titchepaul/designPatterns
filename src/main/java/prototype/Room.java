package prototype;

import prototype.interfaces.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Room implements Prototype {

   private Integer id;
   private List<Wall> walls = new ArrayList<>();

   public Room(){}

    public Room setId(Integer id){
       this.id = id;
       return this;
    }

    public Room addWall(Wall w){
       this.walls.add(w);
       return  this;
    }

    @Override
    public Prototype clone() {
        Room room = new Room();
        for(Wall w : walls){
           room.addWall(w);
        }
        return room;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", walls=" + walls +
                '}';
    }
}
