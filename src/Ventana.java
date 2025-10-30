import javax.swing.*;

public class Ventana extends JFrame {
    public Ventana() {
        setTitle("Mi Ventana Swing");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JButton boton = new JButton("Presionar");
        panel.add(boton);

        add(panel);
    }
}
