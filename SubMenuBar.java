import javax.swing.*;
import java.awt.*;

public class SubMenuBar {
    public static void main(String[] args) {
        JFrame jf=new JFrame("Login Form");


        jf.setLayout(null);
        jf.setSize(450,600);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        
JMenuBar menuBar=new JMenuBar();
JMenu file=new JMenu("file");
menuBar.setBounds(50,100,100,50);

JMenuItem f1=new JMenuItem("Open");
        JMenuItem f2=new JMenuItem("Save");
        file.add(f1);
        file.add(f2);
        jf.add(menuBar);
        menuBar.add(file);

        JMenu recentFile=new JMenu("Recent");
        JMenuItem recent1=new JMenuItem("Doc");
        JMenuItem recent2=new JMenuItem("jpg");

recentFile.add(recent1);
        recentFile.add(recent2);
        file.add(recentFile);





//


    }
}

