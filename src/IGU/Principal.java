package IGU;

import javax.swing.*;
import logica.Controladora;

public class Principal extends JFrame {
    private JButton btnGuardar;
    private JTextField txtNombre;
    private JTextField txtEdad;

    private Controladora control;

    public Principal() {
        control = new Controladora();

        setTitle("Registro de personas");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Nombre: "));
        txtNombre = new JTextField(10);
        panel.add(txtNombre);

        panel.add(new JLabel("Edad"));
        txtEdad = new JTextField(5);
        panel.add(txtEdad);

        btnGuardar = new JButton("Guardar");
        panel.add(btnGuardar);

        btnGuardar.addActionListener(e -> {
            String nombre = txtNombre.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            control.agregarPersona(nombre, edad);
            JOptionPane.showConfirmDialog(this, "Persona guardada correctamente.");
        });

        add(panel);
    }
}
