
import Aviones.AvionB;
import Aviones.AvionA;
import Aviones.Aviones;

public class AirPort {
    public static void main(String[] args) {

        //Cargar aviones temporal
        //TODO guardar lista de aviones en un archivo
        Aviones avion1 = new AvionA("Boeing 747");
        Aviones avion2 = new AvionB("MD-80");
        Aviones avion3 = new AvionA("Pilatus PC-6");
        Aviones avion4 = new AvionB("Airbus A350");

        Gestor gestor = new Gestor();

        gestor.addAviones(avion1);
        gestor.addAviones(avion2);
        gestor.addAviones(avion3);
        gestor.addAviones(avion4);

        gestor.mainMenu();


        System.out.println("EXIT");

    }
}