//Calculator
import java.awt.*;
import java.awt.event.*;
class CalculatorDemo extends Frame implements ActionListener
{
TextField t1,t2,t3;
Button b1,b2,b3,b4,b5;
CalculatorDemo()
{
setLayout(null);
setBackground(Color.cyan);
Font f1=new Font("Times New Roman",Font.BOLD,30);
Font f2=new Font("Times New Roman",Font.BOLD,15);

Label l1=new Label("CALCULATOR");
l1.setFont(f1);
Label l2=new Label("Enter First Number:");
Label l3=new Label("Enter Second Number:");
Label l4=new Label("Result:",Label.RIGHT);
Label l5=new Label("Develop by :@SalunkeVaishnavi");
l5.setFont(f2);
t1=new TextField();
t2=new TextField();
t3=new TextField();
b1=new Button("Add");
b2=new Button("Sub");
b3=new Button("Mul");
b4=new Button("Div");
b5=new Button("CLARE");

l1.setBounds(180,80,240,40);
l2.setBounds(60,200,110,30);
t1.setBounds(180,200,100,30);
l3.setBounds(300,200,130,30);
t2.setBounds(440,200,100,30);
l4.setBounds(160,300,100,30);
t3.setBounds(270,300,100,30);
b1.setBounds(30,400,100,30);
b2.setBounds(140,400,100,30);
b3.setBounds(250,400,100,30);
b4.setBounds(360,400,100,30);
b5.setBounds(470,400,100,30);
l5.setBounds(150,550,300,30);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);

add(l1);
add(l2);add(t1);add(l3);add(t2);
add(l4);add(t3);
add(b1);add(b2);add(b3);add(b4);add(b5);
add(l5);
}
public void actionPerformed(ActionEvent ae)
{

int x=Integer.parseInt(t1.getText());
int y=Integer.parseInt(t2.getText());
if(ae.getSource()==b1)
{
int z=x+y;
t3.setText(z+" ");
}
else if(ae.getSource()==b2)
{
int z=x-y;
t3.setText(z+" ");
}
else if(ae.getSource()==b3)
{
int z=x*y;
t3.setText(z+" ");
}
else if(ae.getSource()==b4)
{
int z=x/y;
t3.setText(z+" ");
}
else if(ae.getSource()==b5)
{
t1.setText("");
t2.setText("");
t3.setText("");

}

}
public static void main(String args[])
{
CalculatorDemo c1=new CalculatorDemo();
c1.setVisible(true);
c1.setSize(600,600);
c1.setTitle("CALCULATOR");
}
}