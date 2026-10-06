public class Main {

    public static void main(String[] args) {

        Orden orden1 = new Orden();
        Cliente cliente1 = new Cliente();
        cliente1.pedir(orden1);
        Chef chef1 = new Chef();
        chef1.leer(orden1);

        System.out.println("Orden creada");

    }
}