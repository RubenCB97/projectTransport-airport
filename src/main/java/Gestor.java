import Aviones.Aviones;
import Aviones.AvionB;
import Aviones.AvionA;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Gestor {

    private ArrayList <Aviones> aviones;

    private CSV csv;

    public Gestor(){
        csv = new CSV();
        aviones = new ArrayList<Aviones>();

    }
    //-----------AVIONES---------------//
    public void addAviones(Aviones avion){
        this.aviones.add(avion);

    }
    Scanner input = new Scanner(System.in);

    public void comprobarAviones(){

        this.aviones.forEach( avion -> {
            System.out.println(avion.getModelo());
        });

    }

    public void buscarAvion(){

        System.out.println("Modelo: ");
        String choice = input.next();

        this.aviones.forEach( avion -> {
            if(avion.getModelo().contains(choice)){
                System.out.println("Modelo: " + avion.getModelo());
                System.out.println("Deposito: " + avion.getDeposito());
                System.out.println("Capacidad de mercancia: " + avion.getCapacidadBodega());
            }
        });
    }

    public void addAvion(){
        String origin;
        String destination;
        System.out.println("¿Que modelo de avion desea anadir ?");
        System.out.println("1 - AvionA");
        System.out.println("2 - AvionB");
        int choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println("----AvionA----");
                System.out.println("¿Destino?");
                destination = input.next();
                Aviones avionA = new AvionA("Boeing 747");
                //Añadir rutas al avión y configurar el avión
                this.aviones.add(avionA);
                //añadir al excel
                break;
            case 2:
                System.out.println("----AvionB----");
                System.out.println("¿Origen?");
                origin = input.next();
                System.out.println("¿Destino?");
                destination = input.next();
                Aviones avionB = new AvionB("MD-80");
                //Añadir rutas al avión y configurar el avión
                this.aviones.add(avionB);
                //añadir al excel
                break;
        }

    }
    public void modAvion(){

    }
    public void removeAvion(){
        comprobarAviones();
        System.out.println("Introduce el modelo del avion que desea eliminar: ");
        String choice = input.next();

        this.aviones.forEach( avion -> {
            if(avion.getModelo().contains(choice)){
                this.aviones.remove(avion);
                //eliminar del excel
            }
        });

    }
    public void gestionAvion(){


        System.out.println("1 - Ver todos los aviones");
        System.out.println("2 - Buscar un avion");
        System.out.println("3 - Anadir avion");
        System.out.println("4 - Modificar avion");
        System.out.println("5 - Eliminar avion");
        int choice = input.nextInt();


        switch (choice) {

            case 1:
                /*CSV csv = new CSV();
                ArrayList<String[]> list = csv.readCSV();
                csv.csvWriter(list);*/
                comprobarAviones();
                break;

            case 2:
                buscarAvion();
                break;

            case 3:
                addAvion();
                break;

            case 4:
                modAvion();
                break;

            case 5:
                removeAvion();
                break;
        }

    }
    //----------PAQUETES----------------//
    public void comprobarPaquetes(){

        System.out.println("Informacion de todos los paquetes");
        System.out.println("---------------------------------");

        ArrayList<String[]> list = this.csv.readCSV();

        list.forEach(x -> System.out.println(Arrays.toString(x).replace(","," |")));


    }
   public void gestorPaquetes() {
       System.out.println("1 - Ver información de todos los paquetes");
       System.out.println("2 - Buscar un paquete");
       System.out.println("3 - Anadir un paquete a un avion");
       System.out.println("4 - Eliminar un paquete de un avion");

       int choice = input.nextInt();


       switch (choice) {

           case 1:
               comprobarPaquetes();
               break;
           case 2:
               break;
           case 3:
               break;
           case 4:
               break;
       }
   }
    public void mainMenu() {
        boolean fin = false;
        while(!fin) {
            try {


                System.out.println("Bienvenido al menu del aeropuerto");
//***************************COMENTARIOS DE PRUEBAS GIT ************************
                System.out.println("Push y pull con intellij");
                System.out.println("¿añadido jdk?");
//***************************COMENTARIOS DE PRUEBAS GIT ************************                
                System.out.println("Eliga una opcion:");

                System.out.println("1- Gestion Avion");
                System.out.println("2- Gestion Pedidos");
                System.out.println("3- Fin");


                int choice = input.nextInt();


                switch (choice) {

                    case 1:
                        System.out.println("Gestion de aviones");
                        gestionAvion();
                        break;
                    case 2:
                        System.out.println("Gestion de pedidos");
                        gestorPaquetes();
                        break;
                    case 3:
                        System.out.println("Hasta luego!");
                        fin = true;
                        break;

                    default:
                        System.out.println("Introduzca un numero valido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduzca un numero valido");
                input.next();
            }
        }
    }
}