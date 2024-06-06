import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.awt.event.ActionEvent;


class GUIhlo{
    JFrame f1,f2;
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton btn,btn2;
    GUIhlo(){

        f1=new JFrame();
        f2=new JFrame();
        f1.setSize(500, 500);
        f1.setLayout(new FlowLayout());
        f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f1.setVisible(true);

        f2.setSize(500, 500);
        f2.setVisible(false);
        f2.setLayout(new FlowLayout());
        f2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        l1=new JLabel("Username");
        t1=new JTextField(20);
        l2=new JLabel("Password");
        t2=new JPasswordField(20);
        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        btn=new JButton("Login");
        f1.add(btn);
        btn2=new JButton("Previous");
        f2.add(btn2);
        l3=new JLabel();
        f2.add(l3);

        btn.addActionListener(this::actionPerformed);
        btn2.addActionListener(this::actionPerformed);







    }
    public void actionPerformed(ActionEvent e){
if(e.getSource()==btn) {
    String user=t1.getText();
    String pass=t2.getText();



    if (user.equals("Renish") && pass.equals("password")) {
        l3.setText("Welcome Renish!");


    } else {
        l3.setText("We cant login you");
    }
    f1.setVisible(false);
    f2.setVisible(true);
}
if(e.getSource()==btn2){
    f2.setVisible(false);
    f1.setVisible(true);

}
    }

}

class GUI_1{
    public static void main(String[] args) {
        new GUIhlo();

    }
}