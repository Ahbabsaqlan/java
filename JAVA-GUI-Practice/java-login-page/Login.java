import javax.swing.*;
import java.awt.event.*;
import java.lang.*;   
public class Login {  
    public Login() {  
        JFrame f=new JFrame("First GUI");
        final JTextField t1,t2;
        System.out.println("Organisation ID");
        JButton b=new JButton("Button 1");
        b.setBounds(50,100,95,30);  
        JButton c=new JButton("Button 2");  
        c.setBounds(146,100,95,30);
          
        t1=new JTextField();  
        t1.setBounds(50,130, 200,30);  
        t2=new JTextField();  
        t2.setBounds(50,150, 200,30);


        b.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                        t1.setText("Welcome to Javatpoint.");  
                    }  
                });
        c.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                        t2.setText("Welcome to Javatpoint.");  
                    }  
                });
        f.add(c);
        f.add(b);
        f.add(t1);
        f.add(t2);
            
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);   
    } 
} 