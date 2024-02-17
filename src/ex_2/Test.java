package ex_2;

import ex_2.vehicles_carrega.Camio;
import ex_2.vehicles_carrega.Furgoneta;
import ex_2.vehicles_transport.Cotxe;
import ex_2.vehicles_transport.Microbus;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    static ArrayList<Vehicle> llistaVehicles = new ArrayList<>();
    public static void main(String[] args) {
        runApp();
    }
    public static void runApp() {
        int option;
        do {
            gui();
            option = introduirInteger();
            handleOption(option);
        } while (option != 0);
    }
    public static void gui() {
        System.out.println("ESCULL UNA OPCIÓ");
        System.out.println("===============================");
        System.out.println("1. AFEGIR NOU VEHICLE");
        System.out.println("2. CALCULAR PREU D'UN VEHICLE");
        System.out.println("===============================");
    }
    public static void handleOption(int option) {
        switch (option) {
            case 1:
                escullirVehicle();
                break;
            case 2:
                if (!llistaVehicles.isEmpty()) {
                    mostrarVehiclesRegistrats();
                    Vehicle vehicle = escollirVehicle();
                    if (vehicle == null) {
                        System.out.println("ERROR: S'HA PRODUIT UN ERROR");
                        runApp();
                    } else {
                        double preuLloguer = vehicle.calcularPreu();
                        System.out.println(preuLloguer + '€');
                    }
                } else {
                    System.out.println("ERROR: NO ES TROBEN VEHICLES DISPONIBLES");
                    runApp();
                }
                break;
            case 0:
                System.out.println("ES TANCA EL PROGRAMA...");
                System.exit(0);
                break;
            default:
                System.out.println("ERROR: NO ÉS UNA OPCIÓ VÀLIDA");
                break;
        }
    }
    public static void mostrarVehiclesRegistrats() {
        for (int i = 0; i < llistaVehicles.size(); i++) {
            System.out.println((i + 1) + ". " + llistaVehicles.get(i));
        }
    }
    public static Vehicle escollirVehicle() {
        System.out.println("ESCULL UN VEHICLE DISPONIBLE");
        Vehicle vehicle = null;
        int option;
        try {
            option = introduirInteger() - 1;
            vehicle = llistaVehicles.get(option);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR: NO ÉS UN VEHICLE DISPONIBLE");
            runApp();
        }
        return vehicle;
    }
    public static void mostrarOpcions() {
        System.out.println("======================");
        System.out.println("1. AFEGIR COTXE");
        System.out.println("2. AFEGIR MICROBÚS");
        System.out.println("3. AFEGIR FURGONETA");
        System.out.println("4. AFEGIR CAMIÓ");
        System.out.println("0. TORNAR AL MENÚ");
        System.out.println("======================");
    }
    public static void escullirVehicle() {
        mostrarOpcions();
        int option = introduirInteger();
        switch (option) {
            case 1:
                Cotxe cotxe = afegirCotxe();
                if (cotxe.getDiesLloguer() == -1 || cotxe.getPlaces() == -1) {
                    runApp();
                } else {
                    llistaVehicles.add(cotxe);
                }
                break;
            case 2:
                Microbus microbus = afegirMicrobus();
                if (microbus.getDiesLloguer() == -1 || microbus.getPlaces() == -1) {
                    runApp();
                } else {
                    llistaVehicles.add(microbus);
                }
                break;
            case 3:
                Furgoneta furgoneta = afegirFurgoneta();
                if (furgoneta.getDiesLloguer() == -1 || furgoneta.getPma() == -1) {
                    runApp();
                } else {
                    llistaVehicles.add(furgoneta);
                }
                break;
            case 4:
                Camio camio = afegirCamio();
                if (camio.getDiesLloguer() == -1 || camio.getPma() == -1) {
                    runApp();
                } else {
                    llistaVehicles.add(camio);
                }
                break;
            case 0:
                break;
            default:
                System.out.println("ERROR: NO ÉS UNA OPCIÓ VÀLIDA");
        }
    }
    public static Cotxe afegirCotxe() {
        System.out.println("INTRODUEIX LA MATRÍCULA");
        String matricula = introduirString();
        System.out.println("INTRODUEIX LA QUANTITAT DE DIES DE LLOGUER");
        int diesLloguer = introduirInteger();
        System.out.println("INTRODUEIX LA QUANTITAT DE PLACES");
        int places = introduirInteger();
        return new Cotxe(matricula, diesLloguer, places);
    }
    public static Microbus afegirMicrobus() {
        System.out.println("INTRODUEIX LA MATRÍCULA");
        String matricula = introduirString();
        System.out.println("INTRODUEIX LA QUANTITAT DE DIES DE LLOGUER");
        int diesLloguer = introduirInteger();
        System.out.println("INTRODUEIX LA QUANTITAT DE PLACES");
        int places = introduirInteger();
        return new Microbus(matricula, diesLloguer, places);
    }
    public static Furgoneta afegirFurgoneta() {
        System.out.println("INTRODUEIX LA MATRÍCULA");
        String matricula = introduirString();
        System.out.println("INTRODUEIX LA QUANTITAT DE DIES DE LLOGUER");
        int diesLloguer = introduirInteger();
        System.out.println("INTRODUEIX EL PMA EN Tm");
        double pma = introduirDouble();
        return new Furgoneta(matricula, diesLloguer, pma);
    }
    public static Camio afegirCamio() {
        System.out.println("INTRODUEIX LA MATRÍCULA");
        String matricula = introduirString();
        System.out.println("INTRODUEIX LA QUANTITAT DE DIES DE LLOGUER");
        int diesLloguer = introduirInteger();
        System.out.println("INTRODUEIX EL PMA EN Tm");
        double pma = introduirDouble();
        return new Camio(matricula, diesLloguer, pma);
    }
    public static int introduirInteger() {
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            return -1;
        }
    }
    public static double introduirDouble() {
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextDouble();
        } catch (InputMismatchException e) {
            return -1;
        }
    }
    public static String introduirString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
