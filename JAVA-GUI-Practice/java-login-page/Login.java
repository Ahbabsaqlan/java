import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.lang.*;
import static javax.swing.JOptionPane.showMessageDialog;   
public class Login {  
    public Login() {  
        JFrame f=new JFrame("Login");
        final JTextField t1;
        JLabel l1,l2,l3; 

        l1=new JLabel("Organisation ID");  
        l1.setBounds(100,50, 100,30);
        t1=new JTextField();  
        t1.setBounds(200,50, 100,30); 

        l2=new JLabel("Password");  
        l2.setBounds(100,100, 100,30);  
        JPasswordField value = new JPasswordField();   
        value.setBounds(200,100, 100,30);
        
        Icon icon = new ImageIcon("login.png");
        JButton b=new JButton(icon);
        b.setBounds(150,150,95,30);
        
        
        l3=new JLabel("Do not have any account?");
        l3.setBounds(50,250,150,30);
        Icon icon2 = new ImageIcon("register.png");
        JButton c=new JButton(icon2);  
        c.setBounds(220,250,110,30);

        double x = 50;
        double y = 50;

        f.setShape(new RoundRectangle2D.Double(x, y, 100, 100, 50, 50));
          
        f.add(l1); 
        f.add(l2);
        f.add(l3);
        f.add(c);
        f.add(b);
        f.add(t1);
        f.add(value);

        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);  
        f.setLayout(null);  
        f.setVisible(true);   
    } 
} 

// b.addActionListener(new ActionListener(){  
//     public void actionPerformed(ActionEvent e){  
//                 t1.setText("Welcome to Javatpoint.");  
//             }  
//         });
// c.addActionListener(new ActionListener(){  
//     public void actionPerformed(ActionEvent e){  
//                 value.setText("Welcome to Javatpoint.");  
//             }  
//         });