package Screens;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;

public class VentanaLogin extends JFrame implements ActionListener {
    // private LoginRepository loginRepository;
    private JLabel textJLabel;
    private JLabel usuarioJLabel;
    private JTextField usuarioJTextField;
    private JLabel contraseniaJLabel;
    private JPasswordField contraseniaJPasswordField;
    private JButton iniciarJButton;
    private JButton registrarJButton;

    public VentanaLogin(String titulo) {
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

        textJLabel = new JLabel("iniciar sesion");
        textJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(textJLabel, gbc);

        gbc.gridy = 1;
        gbc.gridwidth = 1;
        usuarioJLabel = new JLabel("usuario");
        this.add(usuarioJLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 3;
        usuarioJTextField = new JTextField(100);

        this.add(usuarioJTextField, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        contraseniaJLabel = new JLabel("contrasenia");
        this.add(contraseniaJLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 3;

        contraseniaJPasswordField = new JPasswordField(100);
        add(contraseniaJPasswordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;

        gbc.gridwidth = 2;
        gbc.gridheight = 1;

        iniciarJButton = new JButton("iniciar");
        iniciarJButton.addActionListener(this);
        add(iniciarJButton, gbc);

        gbc.gridx = 2;
        registrarJButton = new JButton("registrar");
        registrarJButton.addActionListener(this);
        add(registrarJButton, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
