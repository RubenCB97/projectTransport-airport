package Aviones;

public class AvionA extends Aviones{

    public AvionA(String model){
        super(model);
        super.setDeposito(60);
        super.setCapacidadPasajeros(200);
        super.setCapacidadBodega(300);
        super.setMotores(4);
        super.setTamanoPaquete(Tamano.MEDIUM);
    }
}