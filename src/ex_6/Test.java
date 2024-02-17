package ex_6;

public class Test {
    public static void main(String[] args) {
        Empleat empleat = new Empleat("Diego", 22, 1500);
        System.out.println(empleat.getClass());
        handleClass(empleat);

        Empleat empleat2 = new Empleat();
        empleat2.setNom("Marc");
        empleat2.setEdad(24);
        empleat2.setSalari(1200);
        System.out.println(empleat2.getClass());
        handleClass(empleat2);

        Comercial comercial = new Comercial("Paco", 45, 2000, 15);
        System.out.println(comercial.getClass());
        handleClass(comercial);

        Comercial comercial2 = new Comercial();
        comercial2.setNom("Andrea");
        comercial2.setEdad(32);
        comercial2.setSalari(3000);
        System.out.println(comercial2.getClass());
        handleClass(comercial2);

        Repartidor repartidor = new Repartidor("Mercedes", 36, 1800, "Poblenou");
        System.out.println(repartidor.getClass());
        handleClass(repartidor);

        Repartidor repartidor2 = new Repartidor();
        repartidor2.setNom("Pablo");
        repartidor2.setEdad(46);
        repartidor2.setSalari(2400);
        System.out.println(repartidor2.getClass());
        handleClass(repartidor2);
    }
    public static void handleClass(Empleat empleat) {
        if (empleat instanceof Comercial) {
            System.out.println("SÓC UN COMERCIAL");
        } else if (empleat instanceof Repartidor) {
            System.out.println("SÓC UN REPARTIDOR");
        } else {
            System.out.println("SÓC UN EMPLEAT");
        }
    }
}
