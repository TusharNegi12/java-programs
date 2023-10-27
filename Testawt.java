import java.awt.*;
import java.awt.event.*;

class Testawt extends Frame
{
Button btn;
    public Testawt()
    {
        btn=new Button("Hello World");
        add(btn); 		
        setSize(400, 500);        
        setTitle("Global");  
        setLayout(new FlowLayout());
        setVisible(true);        
    }

    public static void main (String[] args)
    {
        Testawt ta = new Testawt();  
    }
}