import java.lang.*;
import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;
import java.awt.Font;  
public class Dashboard implements ActionListener{  
      
   
	JButton insertBtn;
    JLabel lano;
    JLabel dbgd;
    JButton deleteBtn;
    JButton dispBtn;
    JButton searchBtn;
    JButton logoutBtn;
    JButton exBtn;
	JFrame frame;
	
    Dashboard(){  
        
		frame = new JFrame ("Dashboard");
		
        ImageIcon image = new ImageIcon("image/dashbgd.png");
        dbgd = new JLabel(image);

        Icon iconext = new ImageIcon("image/extbtn.png");
        exBtn=new JButton(iconext);

        insertBtn = new JButton ("Add Product");
        lano = new JLabel ("Welcome Sir!");
        deleteBtn = new JButton ("Delete Product");
        dispBtn = new JButton ("Available Product");
        searchBtn = new JButton ("Search Product");
        logoutBtn = new JButton ("Logout");


        
        frame.add (insertBtn);
        frame.add (lano);
        frame.add (deleteBtn);
        frame.add (dispBtn);
        frame.add (searchBtn);
        frame.add (logoutBtn);
        frame.add (exBtn);
        frame.add (dbgd);

        
        
        lano.setBounds (375, 70, 300, 25);
        insertBtn.setBounds (100, 50, 130, 30);
        deleteBtn.setBounds (100, 100, 130, 30);
        dispBtn.setBounds (100, 150, 130, 30);
        searchBtn.setBounds (100, 200, 130, 30);
        logoutBtn.setBounds (525, 250, 75, 20);
        exBtn.setBounds (560, 20, 24, 22);
        dbgd.setBounds(0, 0, 624, 329);

        Font smallFont = insertBtn.getFont().deriveFont(Font.BOLD, 10f);
        insertBtn.setFont(smallFont);
        deleteBtn.setFont(smallFont);
        dispBtn.setFont(smallFont);
        searchBtn.setFont(smallFont);
        Font smallFonthead = lano.getFont().deriveFont(Font.BOLD, 24f);
        lano.setFont(smallFonthead);

        lano.setForeground(Color.black);
        insertBtn.setBackground(Color.cyan);
        deleteBtn.setBackground(Color.cyan);
        dispBtn.setBackground(Color.cyan);
        searchBtn.setBackground(Color.cyan);
        logoutBtn.setBackground(Color.yellow);

		
		logoutBtn.addActionListener(this);
        exBtn.addActionListener(this);
		
        frame.setSize (624, 329);
		frame.setLocationRelativeTo(null);
        frame.setLayout (null);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane();
        frame.setVisible (true);  
    }     

    public void actionPerformed(ActionEvent e) {  
            
        if(e.getSource()==logoutBtn)
        {  
            new Login();
            frame.setVisible(false);
        }
        if(e.getSource()==exBtn)
        {  
            System.exit(0);
            
        }   	
    }

  
    	
      
}
