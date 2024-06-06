import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CelciusIntoFahr {
    public static void main(String[] args) {
        JFrame jframe=new JFrame("Tempature Conveter");
        jframe.setSize(450,350);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setLayout(null);

        JLabel l1=new JLabel("Celcius:");
        JTextField tf1=new JTextField(15);
        jframe.add(l1);
        l1.setBounds(50, 50, 100, 50);

        jframe.add(tf1);
        tf1.setBounds(250, 50, 100 , 50);

        JLabel l2=new JLabel("Faharheit:");
        JTextField tf2=new JTextField(15);
        jframe.add(l2);
        l2.setBounds(50, 100, 100, 50);
        jframe.add(tf2);
        tf2.setBounds(250, 100, 100 , 50);

        JButton btn=new JButton("Convert");
        jframe.add(btn);
        btn.setBounds(150,250,100,50);

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a=Integer.parseInt(tf1.getText());
                tf2.setText(String.valueOf((a*1.8)+32));
            }
        });


    }
}

