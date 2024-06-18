import javax.swing.*;

public class Formulario2 extends JFrame {
    private JLabel label1;
    private JLabel label2;
    //constructor
    public Formulario2(){
        setLayout(null);
        label1 = new JLabel("Interfaz Grafica");
        label1.setBounds(20,30,400,40);
        add(label1);
        label2 = new JLabel("Version 1.0");
        label2.setBounds(20,110,110,40);
        add(label2);
    }

    public static void main(String[] args) {
        Formulario2 formulario = new Formulario2();
        formulario.setBounds(0,0,400,200);
        formulario.setVisible(true);
        formulario.setResizable(false);
        formulario.setLocationRelativeTo(null);
    }
}
