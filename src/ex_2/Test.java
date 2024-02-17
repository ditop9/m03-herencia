package ex_2;

import ex_2.vehicles_transport.Cotxe;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public ArrayList<Vehicle> llistaVehicles = new ArrayList<>();
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

                break;
            case 2:

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
    public static void escullirVehicle(int option) {
        switch (option) {
            case 1:
                afegirCotxe();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 0:
                break;
            default:
                System.out.println("ERROR: NO ÉS UNA OPCIÓ VÀLIDA");
        }
    }
    public static Cotxe afegirCotxe() {
        String matricula = introduirString();
        int diesLloguer = introduirInteger();
        int places = introduirInteger();
        return new Cotxe(matricula, diesLloguer, places);
    }
    public static int introduirInteger() {
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            return -1;
        }
    }
    public static String introduirString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
