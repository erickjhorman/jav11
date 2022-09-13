package radiobuton;;

import javax.swing.GroupLayout.Group;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class RadioButon extends JFrame {


    public RadioButon() {
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Tablas de Multiplicar");
        setLocationRelativeTo(null);
        panel x = new panel();
        add(x);

    }

    public static void main(String[] args) {
        RadioButon carlos = new RadioButon();
        carlos.setVisible(true);

    }

}

class panel extends JPanel {

    JRadioButton radioSuma, radioResta,radioProducto;
    JButton bQuit;
    JTextField txtNumero1, txtNumero2;
    JLabel lblOperaciones;

    public panel() {
        setLayout(null);

        JLabel lblNumero1 = new JLabel();
        lblNumero1.setText("Numero1");
        add(lblNumero1);
        lblNumero1.setBounds(5, 20, 60, 50);

        JLabel lblNumero2 = new JLabel();
        lblNumero2.setText("Numero2");
        add(lblNumero2);
        lblNumero2.setBounds(5, 80, 60, 50);

        lblOperaciones = new JLabel();
        lblOperaciones.setBounds(150,80,260,50);
        add(lblOperaciones);

        txtNumero1 = new JTextField();
        txtNumero1.setBounds(5, 10, 50, 20);
        add(txtNumero1);

        JButton clear = new JButton();
        clear.setText("Limpiar campos");
        clear.setBounds(10,225, 150,30);
        add(clear);

       ActionListener cleanFields = e -> {
           txtNumero1.setText("");
           txtNumero2.setText("");
       };

        clear.addActionListener(cleanFields);
        txtNumero2 = new JTextField();
        txtNumero2.setBounds(5, 70, 50, 20);
        add(txtNumero2);
        metodoRadioButton();

    }

    public void metodoRadioButton() {
        radioSuma = new JRadioButton("Sumar");
        radioSuma.setBounds(5, 130, 100, 20);
        add(radioSuma);
        radioResta = new JRadioButton("Resta");
        radioResta.setBounds(5, 160, 100, 20);
        add(radioResta);
        radioProducto = new JRadioButton("Multiplicacion");
        radioProducto.setBounds(5, 190, 120, 20);
        add(radioProducto);

        ActionListener sumar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtNumero1.getText().isEmpty() || txtNumero2.getText().isEmpty()){
                   lblOperaciones.setText("No se aceptan campos vacios ");
                   radioSuma.setSelected(false);
               } else {
                   int num = Integer.parseInt(txtNumero1.getText());
                   int num1 = Integer.parseInt(txtNumero2.getText());
                   lblOperaciones.setText("La suma es " + (num + num1));
                   radioSuma.setSelected(false);

               }
            }
        };
        radioSuma.addActionListener(sumar);
    }
}
