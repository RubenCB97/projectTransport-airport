public class Rutas {

    private String origin;
    private String destination;

    public Rutas(String orig, String dest) {
        this.origin = orig;
        this.destination = dest;
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