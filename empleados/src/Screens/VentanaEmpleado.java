package Screens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.toedter.calendar.JDateChooser;

import db.conexion.Repositorys.EmpleadoRepository;
import db.conexion.Repositorys.GenerosRepository;
import db.conexion.models.Empleado;

public class VentanaEmpleado extends JFrame implements ActionListener {

    private Empleado empleado;
    private JLabel textJLabel;
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
    private JDateChooser fechaJDateChooser;
    private JComboBox<String> generoJComboBox;
    private JButton buscarJButton;
    private JButton guardarJButton;
    private JButton modificarJButton;
    private JButton eliminarJButton;
    private JButton limpiarJButton;

    private void GenerosRepository() {
        GenerosRepository generosRepository = new GenerosRepository();
        EmpleadoRepository empleadoRepository = new EmpleadoRepository();
    }

    private VentanaEmpleado(String titulo) {
        super(titulo);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        crearComponentes();
    }

    private void crearComponentes() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.gridx = 0;
        gbc.gridy = 0;

        gbc.gridwidth = 4;
        gbc.gridheight = 1;

        textJLabel = new JLabel("Empleados");
        textJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(textJLabel, gbc);

    }

    /*
     * private void recuperarEmpleado(){
     * // todo
     * }
     * 
     * private void guardarEmpleado(){
     * //todo
     * }
     * private void modificarEmpleado(){
     * //todo
     * }
     * 
     * private void eliminarEmpleado(){
     * //todo
     * }
     * private void limpiarCampos(){
     * //todo
     * }
     * private Empleado dameEmpleado(){
     * //todo
     * }
     * private void actualizaPantalla(){
     * //todo
     * }
     * private void llenarConboBox(){
     * //todo
     * }
     * private boolean validarVacio(){
     * //todo
     * }
     * private void mensajeVacio(){
     * //todo
     * }
     * private void mensajeSelecion(){
     * //todo
     * }
     * /*private boolean mensajeConfirmacion(String mensaje,String accion){
     * //todo
     * }
     * private void mensajeEmailError(){
     * /*
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
