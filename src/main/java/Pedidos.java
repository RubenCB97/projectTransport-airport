
import java.util.Date;

public class Pedidos {

    private String id;

    private Integer weight;
    private Integer size;
    private String trackingCode;
    private Boolean fragile;
    private Date shippingDate;
    private String state;
    private String origin;
    private String destination;

    public Pedidos(String id, int weight, int size, String trackingCode, Boolean fragile, Date shippingDate, String state, String orig, String dest) {
        this.id = id;
        this.weight = weight;
        this.size = size;
        this.trackingCode = trackingCode;
        this.fragile = fragile;
        this.shippingDate = shippingDate;
        this.state = state;
        this.origin = orig;
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

    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    public Boolean getFragile() {
        return fragile;
    }

    public void setFragile(Boolean fragile) {
        this.fragile = fragile;
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
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
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}