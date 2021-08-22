import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTree;
import javax.swing.border.LineBorder;

import daoProjet.ConnexionBD;
import daoProjet.MedicamentDAO;
import daoProjet.PatientDAO;
import modelProjet.Medicament;
import modelProjet.Patient;

import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class Ordonnance extends JFrame {

	private JPanel contentPane;
	private JTextField textOrdon;
	private DefaultListModel model;
	private JList<String> list_med;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ordonnance frame = new Ordonnance();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ordonnance() {
		setTitle("ordonnance");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(new Color(30, 144, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(28, 57, 336, 481);
		contentPane.add(panel);
		
		JComboBox comboBox = new JComboBox<String>();
		comboBox.setBounds(339, 64, 29, 34);
		panel.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Taper un m\u00E9dicament:");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(31, 37, 201, 27);
		panel.add(lblNewLabel);
		
		JLabel lblOrdonnance = new JLabel("Ordonnance : ");
		lblOrdonnance.setForeground(new Color(0, 0, 128));
		lblOrdonnance.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblOrdonnance.setBounds(31, 293, 125, 27);
		panel.add(lblOrdonnance);
		
		JLabel lblQuantit = new JLabel("Quantit\u00E9 :");
		lblQuantit.setForeground(new Color(0, 0, 128));
		lblQuantit.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblQuantit.setBounds(31, 122, 89, 27);
		panel.add(lblQuantit);
		
		JTextArea textQuan = new JTextArea();
		textQuan.setWrapStyleWord(true);
		textQuan.setLineWrap(true);
		textQuan.setForeground(new Color(0, 0, 128));
		textQuan.setBounds(31, 230, 271, 36);
		panel.add(textQuan);
		
		JTextArea choixMed = new JTextArea();
		choixMed.setWrapStyleWord(true);
		choixMed.setLineWrap(true);
		choixMed.setForeground(new Color(0, 0, 128));
		choixMed.setBounds(31, 69, 271, 36);
		panel.add(choixMed);
		
		
		
		
		
		JLabel lblRemarque = new JLabel("Remarque :");
		lblRemarque.setForeground(new Color(0, 0, 128));
		lblRemarque.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblRemarque.setBounds(31, 194, 110, 27);
		panel.add(lblRemarque);
		
		JTextArea textRemarques = new JTextArea();
		textRemarques.setWrapStyleWord(true);
		textRemarques.setLineWrap(true);
		textRemarques.setForeground(new Color(0, 0, 128));
		textRemarques.setBounds(31, 159, 271, 36);
		panel.add(textRemarques);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String q = textQuan.getText();
				String r = textRemarques.getText();
				String m = choixMed.getText();
				
				textOrdon.setText("Medicament :  \n"+m +"\n Quantité: "+q+"\n Remarques"+ r);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBounds(217, 276, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Imprimer");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(31, 445, 110, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Nouvelle ordo");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textQuan.setText(null);
			    textRemarques.setText(null);
				choixMed.setText(null);
				
				textOrdon.setText(null);
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_3.setBounds(151, 445, 151, 21);
		panel.add(btnNewButton_3);
		
		
		
		textOrdon = new JTextField();
		textOrdon.setBounds(31, 330, 271, 98);
		panel.add(textOrdon);
		textOrdon.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(new Color(30, 144, 255));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		panel_1.setBackground(new Color(240, 248, 255));
		panel_1.setBounds(384, 57, 346, 481);
		contentPane.add(panel_1);
		
		JLabel lblPharmacie = new JLabel("Pharmacie : ");
		lblPharmacie.setForeground(new Color(0, 0, 128));
		lblPharmacie.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblPharmacie.setBounds(49, 21, 271, 69);
		panel_1.add(lblPharmacie);
		
		
		 list_med = new JList<>();
		
		list_med.setBounds(23, 123, 297, 271);
		panel_1.add(list_med);
		
		JButton btnNewButton_2_1 = new JButton("Ajouter ou Supprimer M\u00E9dicament");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AjoutSuppMed a = new AjoutSuppMed();
				a.setVisible(true);
				
			}
		});
		btnNewButton_2_1.setBounds(29, 433, 291, 21);
		panel_1.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("Les m\u00E9dicaments existantes :");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(34, 97, 226, 13);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_3_1_1 = new JButton("Actualiser");
		btnNewButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection c2 = ConnexionBD.getConnection();
				try {
					c2.setAutoCommit(false);
					String req = "select \"nomMed\" from medicament";
					Statement ps = c2.createStatement();			
					ResultSet res = ps.executeQuery(req);
					
					model = new DefaultListModel();
					while (res.next())
					{	 
						
							//System.out.println(res.getObject(i).toString());
						model.addElement(res.getObject("nomMed").toString());
						
						list_med.setModel(model);
					}
					
					
					c2.commit();
							
						} catch (SQLException e1) {
							System.out.println(e1.getMessage());
						} catch (Exception e1) {
							System.out.println(e1.getMessage());
						}
				
			}
		});
		btnNewButton_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3_1_1.setBounds(208, 93, 112, 20);
		panel_1.add(btnNewButton_3_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\msi\\Desktop\\mini projet java\\image\\cabinet_medical_photo-a0e49.jpg"));
		lblNewLabel_3.setBounds(-11, 21, 793, 542);
		contentPane.add(lblNewLabel_3);
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 775, 25);
		contentPane.add(menuBar);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Fiche Patient");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Fiche_patient_med fiche1= new Fiche_patient_med(); 
					fiche1.setVisible(true);
					setVisible(false); 
				}		
			
			});
		mntmNewMenuItem_2.setForeground(new Color(255, 0, 51));
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Consultation");
		mntmNewMenuItem_1.setForeground(new Color(255, 0, 51));
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Consultation_interface consula= new Consultation_interface(); 
				consula.setVisible(true);
				setVisible(false); 
			}		
		
		});
			
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Ordonnance");
		mntmNewMenuItem.setForeground(new Color(255, 0, 51));
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.BOLD, 14));
		menuBar.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ordonnance ordo= new Ordonnance(); 
				ordo.setVisible(true);
				setVisible(false); 
			}		
		
		});
		
	}
}