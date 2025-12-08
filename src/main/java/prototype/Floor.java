package prototype;

import prototype.interfaces.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Floor implements Prototype {


    private Integer id;
    private List<Room> listRoom = new ArrayList<>();

    public Floor(){}

    public  Floor setId(Integer id){
        this.id = id;
        return this;
    }
    public Floor addRoom(Room room){
        this.listRoom.add(room);
        return this;
    }
    @Override
    public Prototype clone() {
        Floor floor = new Floor();
        for(Room room : this.listRoom){
            floor.addRoom(room);
        }
        return (Prototype) floor;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "id=" + id +
                ", listRoom=" + listRoom +
                '}';
    }
}
