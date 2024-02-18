package ex_5;

import ex_4.Fitxa;
import ex_4.Obra;
import ex_4.Revista;
import ex_4.Volum;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Biblioteca {
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
                runApp();
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
        System.out.println("6. BUSCAR UNA FITXA PER REFERÈNCIA");
        System.out.println("7. BUSCAR UNA FITXA PER ÍNDEX");
        System.out.println("0. TANCAR EL PROGRAMA");
        System.out.println("==============================");
    }

    public static void handleOption(int option) {
        Scanner sc = new Scanner(System.in);
        Fitxa fitxa;
        switch (option) {
            case 1:
                fitxa = introduirNovaFitxa();
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
            case 5:
                if (!biblioteca.isEmpty()) {
                    mostrarBiblioteca();
                    System.out.println("NÚMERO TOTAL DE FITXES: " + biblioteca.size());
                } else {
                    System.out.println("ERROR: NO ES TROBEN REGISTRES A LA BIBLIOTECA");
                }
                break;
            case 6:
                if (!biblioteca.isEmpty()) {
                    System.out.println("INTRODUEIX LA REFERÈNCIA DE LA FITXA A BUSCAR");
                    String referencia = sc.nextLine();
                    fitxa = buscarFitxaPerReferencia(referencia);
                    if (fitxa == null) {
                        System.out.println("ERROR: NO S'HA TROBAT LA FITXA");
                    } else {
                        System.out.println("FITXA TROBADA:");
                        System.out.println(fitxa);
                    }
                } else {
                    System.out.println("ERROR: NO ES TROBEN REGISTRES A LA BIBLIOTECA");
                }
                break;
            case 7:
                if (!biblioteca.isEmpty()) {
                    int index;
                    System.out.println("INTRODUEIX L'ÍNDEX DE LA FITXA A BUSCAR");
                    mostrarBiblioteca();
                    try {
                        index = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("ERROR: NO ÉS UNA OPCIÓ VÀLIDA");
                        break;
                    }
                    fitxa = buscarFitxaPerIndex(index);
                    if (fitxa != null) {
                        System.out.println("FITXA TROBADA");
                        System.out.println(fitxa);
                    } else {
                        break;
                    }
                } else {
                    System.out.println("ERROR: NO ES TROBEN REGISTRES A LA BIBLIOTECA");
                }
                break;
            case 0:
                System.out.println("EL PROGRAMA ES TANCA...");
                System.exit(0);
                break;
            default:
                System.out.println("ERROR: NO ÉS UNA OPCIÓ VÀLIDA");
        }
    }
    public static void mostrarBiblioteca() {
        for (int i = 0; i < biblioteca.size(); i++) {
            System.out.println((i + 1) + ". " + biblioteca.get(i));
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
    public static Fitxa buscarFitxaPerReferencia(String referencia) {
        for (Fitxa f : biblioteca) {
            if (f.getReferencia().equals(referencia)) {
                return f;
            }
        }
        return null;
    }
    public static Fitxa buscarFitxaPerIndex(int index) {
        try {
            return biblioteca.get(index - 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR: NO ES TROBA LA FITXA");
        }
        return null;
    }
}
