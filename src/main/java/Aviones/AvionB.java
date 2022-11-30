package Aviones;

public class AvionB extends Aviones{

    public AvionB(String model){
        super(model);
        super.setDeposito(100);
        super.setCapacidadPasajeros(400);
        super.setCapacidadBodega(500);
        super.setMotores(2);
    }
}