import java.awt.*;
public class window_hw1
{
    Frame f;
    Label l1;
    Label l2;
    TextField t1;
    TextField t2;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    window_hw1()
    {
        f=new Frame("Calcuator");
        l1=new Label("Enter first value");
        t1=new TextField();
        l2=new Label("Enter second value");
        t2=new TextField();
        b1=new Button("+");
        b2=new Button("-");
        b3=new Button("*");
        b4=new Button("/");
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.setSize(600,600);
        f.setVisible(true);
        f.setLayout(null);
        l1.setBounds(20,50,120,40);
        t1.setBounds(150,50,80,40);
        l2.setBounds(20,100,120,40);
        t2.setBounds(150, 100, 80, 40);
        b1.setBounds(40,150,50,40);
        b2.setBounds(100,150,50,40);
        b3.setBounds(160,150,50,40);
        b4.setBounds(220,150,50,40);
    }

    public static void main(String[] args) {
       new window_hw1();
    }
}