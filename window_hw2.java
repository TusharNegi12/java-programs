
import java.awt.*;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
public class window_hw2 extends Frame {
    Label l1;
    TextField t1;
    Label l2;
    TextField t2;
    Label l3;
    TextField t3;
    Label l4;
    Checkbox c1;
    Checkbox c2;
    Checkbox c3;
    Checkbox c4;
    Checkbox c5;
    Checkbox c6;
    Label l5;
    Label l6;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    // Choice ch;
    List li;
    CheckboxGroup gr;
    window_hw2()
    {
        l1=new Label("Name");
        l2=new Label("Password");
        l3=new Label("Age");
        l4=new Label("Gender");
        l5=new Label("Owner");
        l6=new Label("Country");
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        b1=new Button("Go");
        b2=new Button("Cancel");
        c1=new Checkbox("Car");
        c2=new Checkbox("Tv");
        c3=new Checkbox("Ac");
        c4=new Checkbox("Bike");
        c5=new Checkbox("Male",gr,true);
        c6=new Checkbox("Female",gr,false);
        // ch=new Choice();
        gr=new CheckboxGroup();
        // ch.add("India");
        // ch.add("America");
        // ch.add("Russia");
        // ch.add("Thailand");
        // ch.add("Isreal");
        // ch.add("Sri lanka");
        li=new List(2,false);
        li.add("India");
        li.add("Isreal");
        li.add("Korea");
        li.add("America");
        li.add("Thailand");
        add(li);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(t1);
        add(t2);
        add(t3);
        add(b1);
        add(b2);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
        add(c6);
        // add(ch);
        setLayout(null);
        setVisible(true);
        setSize(600,600);
        l1.setBounds(20,50,100,40);
        t1.setBounds(150,50,80,40);
        l2.setBounds(20,100,100,40);
        t2.setBounds(150,100,80,40);
        l3.setBounds(20,150,100,40);
        t3.setBounds(150,150,80,40);
        l4.setBounds(20,200,100,40);
        c5.setBounds(150,200,80,40);
        c6.setBounds(150,250,80,40);
        // ch.setBounds(120,450,80,80);
        l5.setBounds(20,300,100,40);
        li.setBounds(150,400,80,90);
        c1.setBounds(20,350,80,40);
        c2.setBounds(100,350,80,40);
        c3.setBounds(180,350,80,40);
        c4.setBounds(260,350,80,40);
        l6.setBounds(20, 400, 100, 40);
        b1.setBounds(200, 500, 50, 50);
        b2.setBounds(350, 500, 50, 50);
        setBackground(Color.black);
        setTitle("Registration form");

    }

    public static void main(String[] args) {
        new window_hw2();
    }
}