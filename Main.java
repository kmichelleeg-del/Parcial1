import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a Jack Pizza Chef");

        System.out.println("Seleccione el tipo de masa:");
        System.out.println("1. Delgada");
        System.out.println("2. Gruesa");
        System.out.println("3. Normal");
        int opMasa = sc.nextInt();

        Masa masa = null;

        switch (opMasa) {
            case 1:
                masa = Masa.DELGADA;
                break;
            case 2:
                masa = Masa.GRUESA;
                break;
            case 3:
                masa = Masa.NORMAL;
                break;
        }

        System.out.println("Seleccione la salsa:");
        System.out.println("1. Normal");
        System.out.println("2. Picante");
        System.out.println("3. Agridulce");
        int opSalsa = sc.nextInt();

        TipoSalsa salsa = null;

        switch (opSalsa) {
            case 1:
                salsa = TipoSalsa.NORMAL;
                break;
            case 2:
                salsa = TipoSalsa.PICANTE;
                break;
            case 3:
                salsa = TipoSalsa.AGRIDULCE;
                break;
        }

        System.out.println("Seleccione un topping:");
        System.out.println("1. Jamon");
        System.out.println("2. Pepperoni");
        System.out.println("3. Salchicha");
        System.out.println("4. Pollo");
        System.out.println("5. Camaron");
        int opTopping = sc.nextInt();

        Toppings topping = null;

        switch (opTopping) {
            case 1:
                topping = Toppings.JAMON;
                break;
            case 2:
                topping = Toppings.PEPPERONI;
                break;
            case 3:
                topping = Toppings.SALCHICHA;
                break;
            case 4:
                topping = Toppings.POLLO;
                break;
            case 5:
                topping = Toppings.CAMARON;
                break;
        }

        Pizza pizza = new Pizza(masa, salsa, topping);
        Orden orden = new Orden();

        Cliente cliente = new Cliente();
        cliente.pedir(orden);

        Chef chef = new Chef();
        chef.leer(orden);
        chef.cocinar(pizza);

        System.out.println("Orden realizada");
        System.out.println("Masa: " + masa);
        System.out.println("Salsa: " + salsa);
        System.out.println("Topping: " + topping);

        sc.close();
    }
}