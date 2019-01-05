import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.JLabel.*;
import javax.swing.JPanel.*;
import javax.swing.JFrame.*;
import java.awt.GridLayout.*;


public class TimeTracking {
	
	JPanel mainPanel;
	JFrame loginFrame;
	JPanel fieldPanel;
	
	
	public static void main (String[] args){
		
		new TimeTracking().loginGUI();
	}
	
	public void loginGUI () {
		
		loginFrame = new JFrame();
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Box buttonBox = new Box(BoxLayout.Y_AXIS);
		JPanel loginPanel = new JPanel();
		loginPanel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
		
		JTextField idNumber = new JTextField(20);
		idNumber.setMaximumSize(idNumber.getPreferredSize());
		
		JPasswordField password = new JPasswordField(20);
		password.setMaximumSize(password.getPreferredSize());
		
		JLabel id = new JLabel("ID Number:");
		JLabel pass = new JLabel("Password:");
		
		
		
		JButton login = new JButton("Login");
		buttonBox.add(login);
		
		loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));
		
		loginPanel.add(id);
		loginPanel.add(idNumber);
		loginPanel.add(Box.createVerticalStrut(10));
		loginPanel.add(pass);
		loginPanel.add(password);
		loginPanel.add(Box.createVerticalStrut(10));
		loginPanel.add(buttonBox);
		
		loginFrame.getContentPane().add(BorderLayout.CENTER, loginPanel);
		
		loginFrame.setSize(300,300);
		loginFrame.setVisible(true);
		
		
	}
}