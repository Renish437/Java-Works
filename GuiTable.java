import javax.swing.*;
import java.awt.*;

public class GuiTable extends JFrame {
    public static void main(String[] args) {
       JFrame jframe=new JFrame();
       jframe.setSize(500,500);
       jframe.setLayout(null);
       jframe.setVisible(true);
       jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);

       String []col={"Sn","Name","Rollno"};
       String [][]data={{"1","Renish","437"},{"2","Sudesh","444"},{"3","Ramesh","445"}};
       JTable tb=new JTable(data,col);
       JScrollPane sp=new JScrollPane(tb);
       jframe.add(sp);
       sp.setBounds(50,100,400,100);


    }
}

