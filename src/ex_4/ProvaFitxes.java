package ex_4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProvaFitxes {
    private static ArrayList<Fitxa> biblioteca = new ArrayList<>();

    public static void main(String[] args) {
        runApp();
    }
    public static void runApp() {
        Scanner sc = new Scanner(System.in);
        int option = -1;
        do {
            gui();
            try {
                option = sc.nextInt();
                handleOption(option);
            } catch (InputMismatchException e) {
                System.out.println("ERROR: NO ÉS UNA OPCIÓ VÀLIDA");
            }
        } while (option != 0);
    }
    public static void gui() {
        System.out.println("ESCULL UNA OPCIÓ");
        System.out.println("==============================");
        System.out.println("1. INTRODUIR NOVA FITXA");
        System.out.println("2. INTRODUIR NOVA OBRA");
        System.out.println("3. INTRODUIR NOU VOLUM");
        System.out.println("4. INTRODUIR NOVA REVISTA");
        System.out.println("5. MOSTRAR TOTA LA BIBLIOTECA");
        System.out.println("0. TANCAR EL PROGRAMA");
        System.out.println("==============================");
    }
    public static void handleOption(int option) {
        switch (option) {
            case 1:
                Fitxa fitxa = introduirNovaFitxa();
                if (verificarReferenciaRepetida(fitxa)) {
                    biblioteca.add(fitxa);
                } else {
                    System.out.println("ERROR: JA ES TROBA AQUESTA REFERÈNCIA REGISTRADA");
                }
                break;
            case 2:
                Obra obra = introduirNovaObra();
                if (verificarReferenciaRepetida(obra)) {
                    biblioteca.add(obra);
                } else {
                    System.out.println("ERROR: JA ES TROBA AQUESTA REFERÈNCIA REGISTRADA");
                }
                break;
            case 3:
                Volum volum = introduirNouVolum();
                if (verificarReferenciaRepetida(volum)) {
                    biblioteca.add(volum);
                } else {
                    System.out.println("ERROR: JA ES TROBA AQUESTA REFERÈNCIA REGISTRADA");
                }
                break;
            case 4:
                Revista revista = introduirNovaRevista();
                if (verificarReferenciaRepetida(revista)) {
                    biblioteca.add(revista);
                } else {
                    System.out.println("ERROR: JA ES TROBA AQUESTA REFERÈNCIA REGISTRADA");
                }
                break;
            case 0:
                System.out.println("EL PROGRAMA ES TANCA...");
                System.exit(0);
                break;
        }
    }
    public static Fitxa introduirNovaFitxa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUEIX EL NÚMERO DE REFERÈNCIA");
        String referencia = sc.nextLine();
        System.out.println("INTRODUEIX EL TÍTOL");
        String titol = sc.nextLine();
        return new Fitxa(referencia, titol);
    }
    public static Obra introduirNovaObra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUEIX EL NÚMERO DE REFERÈNCIA");
        String referencia = sc.nextLine();
        System.out.println("INTRODUEIX EL TÍTOL");
        String titol = sc.nextLine();
        System.out.println("INTRODUEIX EL NOM DE L'AUTOR");
        String autor = sc.nextLine();
        System.out.println("INTRODUEIX EL NOMBRE DE PÀGINES");
        short nombrePagines = sc.nextShort();
        return new Obra(referencia, titol, autor, nombrePagines);
    }
    public static Volum introduirNouVolum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUEIX EL NÚMERO DE REFERÈNCIA");
        String referencia = sc.nextLine();
        System.out.println("INTRODUEIX EL TÍTOL");
        String titol = sc.nextLine();
        System.out.println("INTRODUEIX EL NOM DE L'AUTOR");
        String autor = sc.nextLine();
        System.out.println("INTRODUEIX EL NOMBRE DE PÀGINES");
        short nombrePagines = sc.nextShort();
        System.out.println("INTRODUEIX EL NÚMERO DE VOLUM");
        short numeroVolum = sc.nextShort();
        return new Volum(referencia, titol, autor, nombrePagines, numeroVolum);
    }
    public static Revista introduirNovaRevista() {
        Scanner sc = new Scanner(System.in);
        System.out.println("INTRODUEIX EL NÚMERO DE REFERÈNCIA");
        String referencia = sc.nextLine();
        System.out.println("INTRODUEIX EL TÍTOL");
        String titol = sc.nextLine();
        System.out.println("INTRODUEIX L'ANY DE LA REVISTA");
        short any = sc.nextShort();
        System.out.println("INTRODUEIX EL NÚMERO DE REVISTA");
        short numeroRevista = sc.nextShort();
        return new Revista(referencia, titol, any, numeroRevista);
    }
    public static boolean verificarReferenciaRepetida(Fitxa fitxa) {
        for (Fitxa f : biblioteca) {
            if (fitxa.getReferencia().equals(f.getReferencia())) {
                return false;
            }
        }
        return true;
    }
}
