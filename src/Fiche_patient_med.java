import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import daoProjet.PatientDAO;
import modelProjet.Patient;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Fiche_patient_med extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fiche_patient_med frame = new Fiche_patient_med();
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
	public Fiche_patient_med() {
		setResizable(false);
		setTitle("Fiche patient");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 585);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Fiche Patient ");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setBounds(202, 73, 448, 75);
		lblNewLabel.setFont(new Font("Traditional Arabic", Font.ITALIC, 80));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		panel.setBounds(37, 176, 684, 335);
		panel.setBackground(new Color(240, 248, 255));
		panel.setForeground(new Color(30, 144, 255));
		panel.setLayout(null);
		
		JLabel dateCreation = new JLabel("date de la cr\u00E9ation du fiche :");
		dateCreation.setBounds(25, 40, 206, 13);
		dateCreation.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(dateCreation);
		
		JTextField textDateCreation = new JTextField();
		textDateCreation.setBounds(229, 39, 131, 19);
		panel.add(textDateCreation);
		textDateCreation.setColumns(10);
		
		JLabel numP = new JLabel("num fiche patient :");
		numP.setBounds(92, 77, 148, 13);
		numP.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(numP);
		
		JTextField textnumP = new JTextField();
		textnumP.setBounds(229, 76, 131, 19);
		panel.add(textnumP);
		textnumP.setColumns(10);
		
		JLabel nomP = new JLabel("nom :");
		nomP.setBounds(173, 116, 45, 13);
		nomP.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(nomP);
		
		JTextField textnomP = new JTextField();
		textnomP.setBounds(229, 115, 131, 19);
		panel.add(textnomP);
		textnomP.setColumns(10);
		
		JLabel prenom = new JLabel("pr\u00E9nom :");
		prenom.setBounds(152, 157, 77, 13);
		prenom.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(prenom);
		
		JTextField textPrenom = new JTextField();
		textPrenom.setBounds(229, 156, 131, 19);
		panel.add(textPrenom);
		textPrenom.setColumns(10);
		
		JLabel nomJeFille = new JLabel("nom de jeune fille :");
		nomJeFille.setBounds(75, 197, 156, 13);
		nomJeFille.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(nomJeFille);
		
		JTextField textnomJefille = new JTextField();
		textnomJefille.setBounds(228, 196, 132, 19);
		panel.add(textnomJefille);
		textnomJefille.setColumns(10);
		
		JLabel dateNais = new JLabel("date de naissance :");
		dateNais.setBounds(71, 240, 147, 13);
		dateNais.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(dateNais);
		
		JTextField textDateNa = new JTextField();
		textDateNa.setBounds(229, 239, 131, 19);
		panel.add(textDateNa);
		textDateNa.setColumns(10);
		
		JLabel profession = new JLabel("profession :");
		profession.setBounds(386, 240, 104, 13);
		profession.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(profession);
		
		JTextField textProfession = new JTextField();
		textProfession.setBounds(483, 239, 131, 19);
		panel.add(textProfession);
		textProfession.setColumns(10);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(panel);
		
		JLabel adresse = new JLabel("adresse :");
		adresse.setBounds(410, 40, 77, 13);
		adresse.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(adresse);
		
		JTextField textadresse = new JTextField();
		textadresse.setBounds(483, 39, 131, 19);
		panel.add(textadresse);
		textadresse.setColumns(10);
		
		JLabel ville = new JLabel("Ville :");
		ville.setBounds(435, 77, 45, 13);
		ville.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(ville);
		
		JTextField textVille = new JTextField();
		textVille.setBounds(483, 76, 131, 19);
		panel.add(textVille);
		textVille.setColumns(10);
		
		JLabel codePos = new JLabel("code postal :");
		codePos.setBounds(386, 116, 98, 13);
		codePos.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(codePos);
		
		JTextField textCodePos = new JTextField();
		textCodePos.setBounds(483, 115, 131, 19);
		panel.add(textCodePos);
		textCodePos.setColumns(10);
		
		JLabel cin = new JLabel("cin :");
		cin.setBounds(446, 157, 45, 13);
		cin.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(cin);
		
		JTextField textCin = new JTextField();
		textCin.setBounds(483, 156, 131, 19);
		panel.add(textCin);
		textCin.setColumns(10);
		
		JLabel numTel = new JLabel("T\u00E9lephone :");
		numTel.setBounds(393, 197, 123, 13);
		numTel.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(numTel);
		
		JTextField textTel = new JTextField();
		textTel.setBounds(483, 196, 131, 19);
		panel.add(textTel);
		textTel.setColumns(10);
		
			
		JButton btnNewButton = new JButton("Nouveau");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fiche_patient_med fiche1= new Fiche_patient_med(); 
				fiche1.setVisible(true);
				setVisible(false); 
			}		
		
		});
		btnNewButton.setBounds(193, 284, 148, 21);
		panel.add(btnNewButton);
		
		JButton btnA = new JButton("Ajouter");
		btnA.setBounds(383, 284, 133, 21);
		panel.add(btnA);
btnA.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					long codeP = Long.parseLong(textnumP.getText());
					long numTel = Long.parseLong(textTel.getText());
					long cin = Long.parseLong(textCin.getText());
					long codePos = Long.parseLong(textCodePos.getText());
					
					System.out.println(codeP);
					
					Patient p = new Patient(codeP, textnomP.getText(), textPrenom.getText(), cin , textDateNa.getText(), textProfession.getText(), textVille.getText(), textnomJefille.getText(),  textadresse.getText(), numTel, codePos, textDateCreation.getText());
					
					System.out.println("now "+p.getCodeP());
					PatientDAO pDAO = new PatientDAO();
					Patient pAjoutee = pDAO.Ajouter(p);
					
					if (pAjoutee != null)
						JOptionPane.showMessageDialog(null, "Nouveau patient ajouté avec succès");				
					else
						JOptionPane.showMessageDialog(null, "Problème d’ajout du patient");

				}
				catch(Exception ex) { 
		           JOptionPane.showMessageDialog(null, "Veuillez vérifier les données du patient à ajouter!");
					
				}
				
			}
		});
		
		JLabel lblNewLabel_14_1 = new JLabel("");
		lblNewLabel_14_1.setBounds(143, -73, 775, 557);
		panel.add(lblNewLabel_14_1);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\msi\\Desktop\\mini projet java\\image\\our-services.png"));
		lblNewLabel_13.setBounds(86, 35, 127, 113);
		contentPane.add(lblNewLabel_13);
		
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
			
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\msi\\Desktop\\mini projet java\\image\\cabinet_medical_photo-a0e49.jpg"));
		lblNewLabel_1.setBounds(0, 24, 775, 533);
		contentPane.add(lblNewLabel_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
