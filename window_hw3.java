import java.awt.*;

public class window_hw3 extends Frame 

    
{
    Label l1,l2,l3,l4,l5,l7;
    TextField t1,t2,t3;
    List li;
    Button b1;
    Checkbox c1,c2,c3;
    Choice ch;
    CheckboxGroup cg;
    window_hw3()
    {
        l1=new Label("Enter Costumer Name");
        l2=new Label("Select product");
        l3=new Label("Enter Mrp");
        l4=new Label("Select Discount");
        l5=new Label("Gender");
        l7=new Label("Payable amount");
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        li=new List(5,false);
        ch=new Choice();
        cg=new CheckboxGroup();
        ch.add("jeans");
        ch.add("tshirt");
        ch.add("lower");
        ch.add("upper");
        ch.add("shirt");
        li.add("0");
        li.add("10");
        li.add("20");
        li.add("30");
        li.add("40");
        li.add("50");
        c1=new Checkbox("Male",cg,true);
        c2=new Checkbox("Female(2% extra discount)",cg,true);
        c3=new Checkbox("Special constumer(5% extra discount)");
        b1=new Button("Calculate");
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l7);
        add(t1);
        add(t2);
        add(t3);
        add(li);
        add(ch);
        add(c1);
        add(c2);
        add(c3);
        add(b1);
        setVisible(true);
        setSize(600,600);
        setLayout(null);
        l1.setBounds(20,50,130,40);
        setTitle("Shoping Calculator");
        t1.setBounds(180,50,150,40);
        l2.setBounds(20,100,130,40);
        ch.setBounds(180,100,150,40);
        l3.setBounds(20,150,130,40);
        t2.setBounds(180,150,150,40);
        l4.setBounds(20,200,130,40);
        li.setBounds(180,200,70,100);
        l5.setBounds(20,330,130,40);
        c1.setBounds(180,330,150,30);
        c2.setBounds(180,380,200,30);
        c3.setBounds(20,430,250,40);
        b1.setBounds(300,480,80,40);
        l7.setBounds(20,530,130,40);
        t3.setBounds(180,530,150,40);
        setBackground(Color.red);

    }

    public static void main(String[] args) {
        new window_hw3();
    }
}