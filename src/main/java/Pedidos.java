
import java.util.Date;

public class Pedidos {

    private String id;

    private Integer weight;
    private Integer size;
    private Boolean fragile;
    private String state;
    private String destination;

    public Pedidos(String id, int weight, int size , Boolean fragile, String state, String dest) {
        this.id = id;
        this.weight = weight;
        this.size = size;
        this.fragile = fragile;
        this.state = state;
        this.destination = dest;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



    public Boolean getFragile() {
        return fragile;
    }

    public void setFragile(Boolean fragile) {
        this.fragile = fragile;
    }



    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}