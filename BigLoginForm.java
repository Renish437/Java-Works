import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BigLoginForm {
    public static void main(String[] args) {
        JFrame jf=new JFrame("Login Form");



        jf.setLayout(null);
        jf.setSize(500,600);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);

        JMenuBar jb=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenuItem open=new JMenuItem("Open");
        JMenu save=new JMenu("Save");
        JMenuItem submenu1=new JMenuItem("doc");
        JMenuItem submenu2=new JMenuItem("jpg");
        JMenuItem submenu3=new JMenuItem("ppt");
        save.add(submenu1);
        save.add(submenu2);
        save.add(submenu3);


        jf.setJMenuBar(jb);
        jb.add(file);
        file.add(open);
        file.add(save);

        JMenu menu1=new JMenu("Edit");
        JMenuItem undo=new JMenuItem("Undo");
        JMenuItem redo=new JMenuItem("Redo");
        JMenuItem copy=new JMenuItem("Copy");
        JMenuItem paste=new JMenuItem("Paste");
        jb.add(menu1);
        menu1.add(undo);
        menu1.add(redo);
        menu1.add(copy);
        menu1.add(paste);










   JLabel l0ne=new JLabel("Login Form");
        jf.add(l0ne);
       l0ne.setBounds(150,0,100,50);
       l0ne.setFont(new Font("Anta",Font.BOLD,15));
       l0ne.setForeground(Color.BLACK);
       l0ne.setBackground(Color.orange);
       l0ne.setOpaque(true);

       Container contentpane=jf.getContentPane();
       contentpane.setBackground(Color.BLACK);


        JLabel l1=new JLabel("Name");
        jf.add(l1);
        l1.setBounds(50,50,150,50);

        l1.setFont(new Font("Anta",Font.BOLD,13));
        l1.setForeground(Color.ORANGE);
        l1.setBackground(Color.BLACK);
        l1.setOpaque(true);




        JLabel l2=new JLabel("Phone");
        jf.add(l2);
        l2.setBounds(50,100,150,50);
        l2.setFont(new Font("Anta",Font.BOLD,13));
        l2.setForeground(Color.ORANGE);
        l2.setBackground(Color.BLACK);
        l2.setOpaque(true);


        JLabel l3=new JLabel("Password");
        jf.add(l3);
        l3.setBounds(50,150,150,50);
        l3.setFont(new Font("Anta",Font.BOLD,13));
        l3.setForeground(Color.ORANGE);
        l3.setBackground(Color.BLACK);
        l3.setOpaque(true);


        JLabel l4=new JLabel("Re-Password");
        jf.add(l4);
        l4.setBounds(50,200,150,50);
        l4.setFont(new Font("Anta",Font.BOLD,13));
        l4.setForeground(Color.ORANGE);
        l4.setBackground(Color.BLACK);
        l4.setOpaque(true);

        JLabel l5=new JLabel("Gender");
        jf.add(l5);
        l5.setBounds(50,250,150,50);
        l5.setFont(new Font("Anta",Font.BOLD,13));
        l5.setForeground(Color.ORANGE);
        l5.setBackground(Color.BLACK);
        l5.setOpaque(true);



        JLabel l6=new JLabel("Education");
        jf.add(l6);
        l6.setBounds(50,300,150,50);
        l6.setFont(new Font("Anta",Font.BOLD,13));
        l6.setForeground(Color.ORANGE);
        l6.setBackground(Color.BLACK);
        l6.setOpaque(true);


        JTextField t1=new JTextField();
        jf.add(t1);
        t1.setBounds(300,50,200,50);
        t1.setBackground(Color.LIGHT_GRAY);
        t1.setFont(new Font("Anta",Font.BOLD,15));
        t1.setForeground(Color.MAGENTA);


        JTextField t2=new JTextField();
        jf.add(t2);
        t2.setBounds(300,100,200,50);
        t2.setBackground(Color.LIGHT_GRAY);
        t2.setFont(new Font("Anta",Font.BOLD,15));
        t2.setForeground(Color.MAGENTA);

        JTextField t3=new JTextField();
        jf.add(t3);
        t3.setBounds(300,150,200,50);
        t3.setBackground(Color.LIGHT_GRAY);
        t3.setFont(new Font("Anta",Font.BOLD,15));
        t3.setForeground(Color.MAGENTA);

        JTextField t4=new JTextField();
        jf.add(t4);
        t4.setBounds(300,200,200,50);
        t4.setBackground(Color.LIGHT_GRAY);
        t4.setFont(new Font("Anta",Font.BOLD,15));
        t4.setForeground(Color.MAGENTA);

        JRadioButton t5=new JRadioButton("Male");
        jf.add(t5);
        t5.setBounds(300,250,100,50);
        t5.setBackground(Color.LIGHT_GRAY);
        t5.setFont(new Font("Anta",Font.BOLD,15));
        t5.setForeground(Color.RED);

        JRadioButton t51=new JRadioButton("Female");
        jf.add(t51);
        t51.setBounds(400,250,100,50);
        t51.setBackground(Color.LIGHT_GRAY);
        t51.setFont(new Font("Anta",Font.BOLD,15));
        t51.setForeground(Color.RED);

        ButtonGroup bt=new ButtonGroup();
        bt.add(t5);
        bt.add(t51);





        JCheckBox t6=new JCheckBox("+2");
        jf.add(t6);
        t6.setBounds(300,300,100,50);
        t6.setBackground(Color.LIGHT_GRAY);
        t6.setFont(new Font("Anta",Font.BOLD,15));
        t6.setForeground(Color.blue);

        JCheckBox t61=new JCheckBox("Bachelor");
        jf.add(t61);
        t61.setBounds(400,300,100,50);
        t61.setBackground(Color.LIGHT_GRAY);
        t61.setFont(new Font("Anta",Font.BOLD,14));
        t61.setForeground(Color.blue);

        ButtonGroup bt2=new ButtonGroup();
        bt2.add(t6);
        bt2.add(t61);

        JButton btn=new JButton("Submit");
        jf.add(btn);
        btn.setBounds(200,400,100,50);
        btn.setFont(new Font("Anta",Font.BOLD,15));
btn.setForeground(Color.YELLOW);
btn.setBackground(Color.gray);

        Color defaultColor=btn.getBackground();
        Color hover=Color.GREEN;
btn.addMouseListener(new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        btn.setBackground(hover);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        btn.setBackground(defaultColor);

    }
});




    }
}