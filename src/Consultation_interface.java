import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;

import daoProjet.ConsultationDAO;

import modelProjet.Consultation;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Canvas;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Consultation_interface extends JFrame {

	private JPanel contentPane;
	private JTextField textNumP;
	private JTextField textTaille,textPoid,textTension,textTemp,textPerim,textRq;
	
	private JTextField Rq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultation_interface frame = new Consultation_interface();
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
	public Consultation_interface() {
		setTitle("Consultation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 648);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\msi\\Desktop\\mini projet java\\image\\doctor1.png"));
		lblNewLabel.setBounds(62, 10, 90, 168);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Consultation");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 78));
		lblNewLabel_1.setBounds(162, 52, 516, 90);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(new Color(30, 144, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(10, 235, 361, 366);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2_1 = new JLabel("num fiche patient :");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(20, 72, 132, 13);
		panel.add(lblNewLabel_2_1);
		
		textNumP = new JTextField();
		textNumP.setColumns(10);
		textNumP.setBounds(152, 70, 184, 19);
		panel.add(textNumP);
		
		JLabel lblNewLabel_5 = new JLabel("Type consultation : ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(10, 33, 132, 13);
		panel.add(lblNewLabel_5);
		
		JComboBox type = new JComboBox();
		type.setModel(new DefaultComboBoxModel(new String[] {"Nouvelle ", "Controle"}));
		type.setBounds(152, 30, 184, 21);
		panel.add(type);
		
		textRq = new JTextField();
		textRq.setColumns(10);
		textRq.setBounds(20, 101, 318, 215);
		panel.add(textRq);
		
		JButton btnEnregistrer = new JButton("Enregistrer :");
		btnEnregistrer.setBounds(86, 326, 184, 21);
		panel.add(btnEnregistrer);
		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnregistrer.setForeground(new Color(0, 0, 128));
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(new Color(30, 144, 255));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 128), 4));
		panel_1.setBackground(new Color(240, 248, 255));
		panel_1.setBounds(409, 235, 352, 248);
		contentPane.add(panel_1);
		
		JLabel taillePatient = new JLabel("taille Patient :");
		taillePatient.setFont(new Font("Tahoma", Font.BOLD, 14));
		taillePatient.setBounds(66, 42, 148, 13);
		panel_1.add(taillePatient);
		
		textTaille = new JTextField();
		textTaille.setColumns(10);
		textTaille.setBounds(201, 41, 117, 19);
		panel_1.add(textTaille);
		
		JLabel poidP = new JLabel("Poid de Patient :");
		poidP.setFont(new Font("Tahoma", Font.BOLD, 14));
		poidP.setBounds(28, 82, 148, 13);
		panel_1.add(poidP);
		
		textPoid = new JTextField();
		textPoid.setColumns(10);
		textPoid.setBounds(201, 81, 117, 19);
		panel_1.add(textPoid);
		
		JLabel tensionP = new JLabel("Tension Art\u00E9rielle  :");
		tensionP.setFont(new Font("Tahoma", Font.BOLD, 14));
		tensionP.setBounds(28, 124, 148, 13);
		panel_1.add(tensionP);
		
		textTension = new JTextField();
		textTension.setColumns(10);
		textTension.setBounds(201, 123, 117, 19);
		panel_1.add(textTension);
		
		JLabel tempeP = new JLabel("Temp\u00E9rature  :");
		tempeP.setFont(new Font("Tahoma", Font.BOLD, 14));
		tempeP.setBounds(55, 161, 148, 13);
		panel_1.add(tempeP);
		
		textTemp = new JTextField();
		textTemp.setColumns(10);
		textTemp.setBounds(201, 160, 117, 19);
		panel_1.add(textTemp);
		
		JLabel perimP = new JLabel("P\u00E9rim\u00E9tre  de Patient :");
		perimP.setFont(new Font("Tahoma", Font.BOLD, 14));
		perimP.setBounds(13, 198, 163, 13);
		panel_1.add(perimP);
		
		textPerim = new JTextField();
		textPerim.setColumns(10);
		textPerim.setBounds(201, 197, 117, 19);
		panel_1.add(textPerim);
		
		btnEnregistrer.setForeground(new Color(0, 0, 128));
		btnEnregistrer.setBounds(72, 239, 181, 21) ;
		
		JButton btnEnregistrer_1 = new JButton("Enregistrer");
		btnEnregistrer_1.setForeground(new Color(0, 0, 128));
		btnEnregistrer_1.setBounds(94, 326, 179, 21);
		panel.add(btnEnregistrer_1);
		btnEnregistrer_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					long codeC = Long.parseLong(textNumP.getText());
					String typeC = (type.getSelectedItem()).toString();
					System.out.println(typeC);
					String remarques = textRq.getText()+ "Info sur examen Clinique : \n"
							+"Périmètre :" +textPerim.getText() + "\n Poids: "+ textPoid.getText()+ "\n Taille :"+textTaille.getText()
							+  "\n Température :"+ textTemp.getText() + "\n Tension" +textTension.getText();
					Consultation c = new Consultation(codeC, typeC, remarques);
					
					ConsultationDAO cDAO = new ConsultationDAO();
					Consultation cAjoutee = cDAO.Ajouter(c);
					
					if (cAjoutee != null)
						JOptionPane.showMessageDialog(null, "Nouveau Consultation ajouté avec succès");				
					else
						JOptionPane.showMessageDialog(null, "Problème d’ajout du Consultation");

				}
				catch(Exception ex) { 
		           JOptionPane.showMessageDialog(null, "Veuillez vérifier les données du Consultation à ajouter!");
					
				}
				
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("Ant\u00E9cedant :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel_2.setBounds(10, 188, 223, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Examen Clinique : ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 29));
		lblNewLabel_3.setBounds(409, 187, 298, 26);
		contentPane.add(lblNewLabel_3);
		
		JButton btnEcrireUneOrdonnance = new JButton("Ecrire une ordonnance : ");
		btnEcrireUneOrdonnance.setBackground(new Color(173, 216, 230));
		btnEcrireUneOrdonnance.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnEcrireUneOrdonnance.setForeground(new Color(0, 0, 128));
		btnEcrireUneOrdonnance.setBounds(488, 525, 203, 26);
		btnEcrireUneOrdonnance.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Ordonnance ordo = new Ordonnance();
				ordo.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnEcrireUneOrdonnance);
		
		JButton btnNouvelleConsultation = new JButton("Nouvelle Consultation : ");
		btnNouvelleConsultation.setBackground(new Color(173, 216, 230));
		btnNouvelleConsultation.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNouvelleConsultation.setForeground(new Color(0, 0, 128));
		btnNouvelleConsultation.setBounds(488, 561, 203, 26);
		btnNouvelleConsultation.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Tous les modifications vont etre supprimer");
				Consultation_interface conso = new Consultation_interface();
				conso.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnNouvelleConsultation);
		
		
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
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\msi\\Desktop\\mini projet java\\image\\cabinet_medical_photo-a0e49.jpg"));
		lblNewLabel_4.setBounds(0, 22, 803, 601);
		contentPane.add(lblNewLabel_4);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ordonnance ordo= new Ordonnance(); 
				ordo.setVisible(true);
				setVisible(false); 
			}		
		
		});
	}
}
