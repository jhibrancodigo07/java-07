package Screens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.GridBagLayout;

import db.conexion.models.Empleado;

public class VentanaEmpleado extends JFrame implements ActionListener {
    private Empleado empleado;
    private JLabel textLabel;
    private JLabel numeroEmpleadoJLabel;
    private JLabel nombreJLabel;
    private JLabel domicilioJLabel;
    private JLabel telefonoJLabel;
    private JLabel emailJLabel;
    private JLabel fechaJLabel;
    private JLabel generoJLabel;
    private JComboBox<Long> numeroEmpleadoJComboBox;
    private JTextField nombreJTextField;
    private JTextField domicilioJTextField;
    private JTextField telefonoJTextField;
    private JTextField emailJTextField;
    private JColorChooser fehcaJDateChooser;
    private JComboBox<String> generoJComboBox;
    private JButton buscarJButton;
    private JButton guardarJButton;
    private JButton modificarJButton;
    private JButton eliminarJButton;
    private JButton limpiarJButton;

    /*
     * public VentanaEmpleado(String titulo) {
     * super(titulo);
     * setSize(300, 200);
     * setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     * this.setLayout(new GridBagLayout());
     * crearComponentes();
     */

    // private void crearComponentes() {
    /*
     * GridBagConstraints gbc = new GridBagConstraints();
     * gbc.fill = GridBagConstraints.BOTH;
     * gbc.insets = new Insets(10, 10, 10, 10);
     * gbc.weightx = 1.0;
     * gbc.weighty = 1.0;
     * gbc.gridx = 0;
     * gbc.gridy = 0;
     * 
     * gbc.gridwidth = 4;
     * gbc.gridheight = 1;
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
