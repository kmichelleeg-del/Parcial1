import java.awt.*;
import javax.swing.*;

public class Vista {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Jack Pizza Chef");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));

        JPanel campos = new JPanel(new GridLayout(3, 2, 5, 5));
        campos.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JComboBox<Masa> masa = new JComboBox<>(Masa.values());
        JComboBox<TipoSalsa> salsa = new JComboBox<>(TipoSalsa.values());
        JComboBox<Toppings> topping = new JComboBox<>(Toppings.values());

        campos.add(new JLabel("Masa:"));
        campos.add(masa);

        campos.add(new JLabel("Salsa:"));
        campos.add(salsa);

        campos.add(new JLabel("Topping:"));
        campos.add(topping);

        JTextArea salida = new JTextArea(5, 25);
        salida.setEditable(false);

        JButton ordenar = new JButton("Crear orden");

        ordenar.addActionListener(e -> {

            Masa masaElegida = (Masa) masa.getSelectedItem();
            TipoSalsa salsaElegida = (TipoSalsa) salsa.getSelectedItem();
            Toppings toppingElegido = (Toppings) topping.getSelectedItem();

            Pizza pizza = new Pizza(masaElegida, salsaElegida, toppingElegido);

            Orden orden = new Orden();

            Cliente cliente = new Cliente();
            cliente.pedir(orden);

            Chef chef = new Chef();
            chef.leer(orden);
            chef.cocinar(pizza);

            salida.setText(
                    "Orden creada"
                    + "\nMasa: " + masaElegida
                    + "\nSalsa: " + salsaElegida
                    + "\nTopping: " + toppingElegido
            );
        });

        frame.add(campos, BorderLayout.NORTH);
        frame.add(ordenar, BorderLayout.CENTER);
        frame.add(new JScrollPane(salida), BorderLayout.SOUTH);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}