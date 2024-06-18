import javax.swing.*;

public class Practica extends JFrame {
    private JLabel label1;
    public Practica(){
        setLayout(null);
        label1 = new JLabel("HOLA MUNDO");
        label1.setBounds(0,0,200,300);
        add(label1);
    }

    public static void main(String[] args) {
        Practica practica1 = new Practica();
        practica1.setBounds(100,100,1000,1000);
        practica1.setVisible(true);
        practica1.setLocationRelativeTo(null);
        practica1.setResizable(false);
    }
}