import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxOperation extends JFrame  {
    public static void main(String[] args) {
        ;
        JFrame jf=new JFrame();
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setLayout(null);

        JLabel l1 = new JLabel("Value1");
        l1.setBounds(50,50,150,50);
        jf.add(l1);
        JTextField t1 = new JTextField();
        t1.setBounds(250,50,150,30);
        jf.add(t1);

        JLabel l2 = new JLabel("Value2");
        l2.setBounds(50,100,150,50);
        jf.add(l2);
        JTextField t2 = new JTextField();
        t2.setBounds(250,100,150,30);
        jf.add(t2);

        JLabel l3 = new JLabel("Result");
        l3.setBounds(50,150,150,50);
        jf.add(l3);
        JTextField t3 = new JTextField();
        t3.setBounds(250,150,150,30);
        jf.add(t3);



        JComboBox jc=new JComboBox();
        jc.addItem("Add");
        jc.addItem("Subtract");
        jc.addItem("Multiply");
        jc.addItem("Divide");


        jc.setBounds(150,250,100,50);
        jf.add(jc);

        jc.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

              try{  if(e.getStateChange()==ItemEvent.SELECTED){
                    double a= Double.parseDouble(t1.getText());
                    double b=Double.parseDouble(t2.getText());
                    double result=0;

                    String operation=(String)jc.getSelectedItem();

                    switch (operation){
                        case "Add":
                            result=a+b;
                            break;
                        case "Subtract":
                            result=a-b;
                            break;

                        case "Multiply":
                            result=a*b;
                            break;

                        case "Divide":
                            if(b==0){
                                JOptionPane.showMessageDialog(jf,"Cannot divided by 0");

                            }
                            else{
                                result=a/b;
                                return;
                            }

                            break;


                    }
                  t3.setText(String.valueOf(result));

                }}
              catch (NumberFormatException nfe){
                  JOptionPane.showMessageDialog(jf,"Enter a valid number");
              }

            }
        });




    }
}

