package Aviones;

public abstract class Aviones  {
    private String modelo;
    private Integer deposito;
    private Integer capacidadPasajeros;
    private Integer capacidadBodega;
    private Integer motores;
    private Tamano tamanoPaquete;

    private Integer id;

    private static Integer idKey=0;

    public Integer getMotores() {
        return motores;
    }

    public void setMotores(Integer motores) {
        this.motores = motores;
    }

    public Aviones (String modelo){

        this.modelo = modelo;
        this.deposito=0;
        this.capacidadBodega=0;
        this.capacidadPasajeros=0;
        this.tamanoPaquete = Tamano.INPACKABLE;
        this.id=idKey;
        this.idKey++;
    }

    public Tamano getTamanoPaquete() {
        return tamanoPaquete;
    }

    public void setTamanoPaquete(Tamano tamanoPaquete) {
        this.tamanoPaquete = tamanoPaquete;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getDeposito() {
        return deposito;
    }

    public void setDeposito(Integer deposito) {
        this.deposito = deposito;
    }

    public Integer getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(Integer capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public Integer getCapacidadBodega() {
        return capacidadBodega;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidadBodega(Integer capacidadBodega) {
        this.capacidadBodega = capacidadBodega;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }
}