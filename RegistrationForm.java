package src.main;

import javax.swing.*;
import java.awt.*;


public class RegistrationForm  extends JDialog{
    private JTextField tfNev;
    private JTextField tfEmail;
    private JTextField tfTelefonszam;
    private JTextField tfLakcim;
    private JButton btnRegisztracio;
    private JButton btnKilepes;
    private JPasswordField pwfJelszo;
    private JPasswordField pwfMasodlagosJelszo;
    private JPanel RegisztraciosPanel;
    public RegistrationForm(JFrame szulo)
    {
        super(szulo);
        setTitle("Hozzon létre egy új felhasználót:");
        setContentPane(RegisztraciosPanel);
        setMinimumSize(new Dimension(450,474));
        setModal(true);
        setLocationRelativeTo(szulo);
        setVisible(true);
    }

    public static void main(String[] args) {
        RegistrationForm myForm=new RegistrationForm(null);
    }
}
