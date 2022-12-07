import java.lang.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;  
import java.awt.event.*;
import java.awt.event.ActionListener;  
import static javax.swing.JOptionPane.showMessageDialog;
public class Login implements ActionListener {  
    
	private JButton lgnBtn;
    private JButton regBtn;
    private JButton frgBtn;
    private JButton exBtn;
    private JLabel lusn;
    private JLabel lpass;
    private JLabel lreg;
    private JLabel lbgd;
    private JTextField uname;
    private JPasswordField upass;
	JFrame frame;
	
	
    Login(){  
	
		frame = new JFrame ("Login");

        ImageIcon image = new ImageIcon("image/Lbgrnd.png");
        lbgd = new JLabel(image);

        ImageIcon iconlgn = new ImageIcon("image/login.png");
        lgnBtn=new JButton(iconlgn);

        ImageIcon iconreg = new ImageIcon("image/register.png");
        regBtn=new JButton(iconreg);

        frgBtn=new JButton("Forget Your Password");
        
        ImageIcon iconext = new ImageIcon("image/extbtn.png");
        exBtn=new JButton(iconext);

        lusn = new JLabel ("Organisation ID");
        lpass = new JLabel ("Password");
        lreg = new JLabel ("Not Have Any Account?");

        uname = new JTextField ();
        upass = new JPasswordField ();

        lgnBtn.setBounds (230, 200, 110, 32);
        regBtn.setBounds (305, 300, 114, 32);
        frgBtn.setBounds (195, 250, 180, 25);
        exBtn.setBounds (500, 25, 24, 22);
        lusn.setBounds (140, 105, 150, 25);
        lpass.setBounds (140, 145, 150, 25);
        lreg.setBounds (150, 300, 200, 30);
        uname.setBounds (285, 105, 150, 25);
        upass.setBounds (285, 145, 150, 25);
        lbgd.setBounds(0, 0, 570, 400);
		
		lgnBtn.addActionListener(this);
        exBtn.addActionListener(this);

        lusn.setForeground(Color.white);
        lpass.setForeground(Color.white);
        lreg.setForeground(Color.white);
        frgBtn.setBackground(Color.cyan);
        lgnBtn.setBorder(new Border(10)); //10 is the radius

        Font lFont = lusn.getFont().deriveFont(Font.BOLD, 15f);
        lusn.setFont(lFont);
        lpass.setFont(lFont);

        frame.add (lgnBtn);
        frame.add (regBtn);
        frame.add (frgBtn);
        frame.add (exBtn);
        frame.add (lusn);
        frame.add (lpass);
        frame.add (lreg);
        frame.add (uname);
        frame.add (upass);
        frame.add (lbgd);

        frame.setSize (570, 400);
		frame.setLocationRelativeTo(null);
        frame.setLayout (null);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane();
        frame.setVisible (true); 
    }         
    public void actionPerformed(ActionEvent e) {  

        if(e.getSource()==lgnBtn)
		{  
			String user = uname.getText();
			String pass = upass.getText();
			
			if(user.equals("admin") && pass.equals("1234"))
			{
				new Dashboard();
				frame.setVisible(false);
				
			}
			else
			{
				showMessageDialog(null, "Invalid Username or password!");
			}
        }
        if(e.getSource()==exBtn)
        {  
            System.exit(0);
            
        }  
    }  
} 