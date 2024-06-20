import javax.swing.*;

public class Formulario1 extends JFrame {
    private JLabel label2;
    //constructor
    public Formulario1(){
        setLayout(null);


    }

    public static void main(String[] args) {
        Formulario1 formula = new Formulario1();
        formula.setBounds(0,0,400,550);
        formula.setVisible(true);
        formula.setLocationRelativeTo(null);
        formula.setResizable(false);
    }

}
