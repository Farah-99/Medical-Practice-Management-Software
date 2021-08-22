import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JLayeredPane;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

public class Interface extends JFrame {

	private JFrame Frame;
	private JTextField usernameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.Frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Frame = new JFrame();
		Frame.setResizable(false);
		Frame.setAutoRequestFocus(false);
		Frame.setBackground(new Color(128, 128, 128));
		Frame.setTitle("Authentification");
		Frame.setFont(new Font("Consolas", Font.BOLD, 19));
		Frame.setForeground(Color.BLACK);
		Frame.setBounds(100, 100, 645, 545);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login:");
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setBounds(70, 193, 143, 46);
		lblNewLabel.setFont(new Font("MS Mincho", Font.BOLD, 45));
		Frame.getContentPane().add(lblNewLabel);
		
		usernameField = new JTextField();
		usernameField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		usernameField.setForeground(Color.BLACK);
		usernameField.setBounds(309, 193, 232, 52);
		Frame.getContentPane().add(usernameField);
		usernameField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(0, 0, 255));
		lblPassword.setBounds(70, 265, 214, 46);
		lblPassword.setFont(new Font("MS Mincho", Font.BOLD, 45));
		Frame.getContentPane().add(lblPassword);
		
		JButton btnNewButton = new JButton("Entrer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username= usernameField.getText().toString()	;
				String password = passwordField.getText().toString() ; 	
				
				
				//secretaire : username:secretaire  password:secrétaire123
				//medecin username:medecin password:medecin123
				
				if ( (!username.equals("")) || ( !password.equals("")) )  {
					if ( username.equals("secretaire") && (password.equals("secretaire123"))) 
					{
						Fiche_patient_sec fiche1= new Fiche_patient_sec(); 
						fiche1.setVisible(true);
						
					}
					else if  ( username.equals("medecin") && (password.equals("medecin123"))) {
						Fiche_patient_med fiche1= new Fiche_patient_med(); 
						fiche1.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "Conexion échoué");
						
					}
				}
				
				
				
				
			
			
			}
		});
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnNewButton.setForeground(new Color(199, 21, 133));
		btnNewButton.setBounds(155, 359, 132, 46);
		Frame.getContentPane().add(btnNewButton);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setVerticalAlignment(SwingConstants.TOP);
		btnAnnuler.setForeground(new Color(199, 21, 133));
		btnAnnuler.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnAnnuler.setBackground(new Color(255, 255, 255));
		btnAnnuler.setBounds(334, 359, 151, 46);
		Frame.getContentPane().add(btnAnnuler);
		
		JLabel lblNewLabel_1 = new JLabel("Bienvenue dans notre Cabinet");
		lblNewLabel_1.setForeground(new Color(199, 21, 133));
		lblNewLabel_1.setFont(new Font("Vivaldi", Font.BOLD | Font.ITALIC, 51));
		lblNewLabel_1.setBounds(35, 10, 586, 97);
		Frame.getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBackground(Color.WHITE);
		passwordField.setBounds(309, 255, 232, 52);
		Frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\msi\\Desktop\\mini projet java\\image\\cabinet_medical_photo-a0e49.jpg"));
		lblNewLabel_2.setBounds(0, 0, 641, 518);
		Frame.getContentPane().add(lblNewLabel_2);
	}
}
