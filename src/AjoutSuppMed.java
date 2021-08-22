import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import daoProjet.MedicamentDAO;
import modelProjet.Medicament;

public class AjoutSuppMed extends JFrame implements ActionListener {
	
	private JPanel panel;
	private JPanel panel2;
	private JButton btnaj;
	private JButton btnSupp;
	private JTextField textNom;
	private JTextField textId;

	public AjoutSuppMed() {
		setTitle("Médicament");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 350, 200);
		panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		panel2 = new JPanel();
		add(panel2, BorderLayout.CENTER);
		JLabel Id= new JLabel("Entrer l'Id du médicament");
		panel2.add(Id);
		 textId = new JTextField(20);
		panel2.add(textId);
		JLabel nom= new JLabel("Entrer le nom du médicament");
		panel2.add(nom);
		 textNom = new JTextField(20);
		textNom.setSize(20, 20);
		panel2.add(textNom);
		 btnSupp = new JButton("Supprimer");
		btnSupp.setBounds(20, 50, 85, 21);
		btnSupp.addActionListener(this);
		panel.add(btnSupp);
		btnaj = new JButton("Ajouter");
		btnaj.setBounds(50, 50, 85, 21);
		btnaj.addActionListener(this);
		panel.add(btnaj);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		String n = textNom.getText();
		String i= textId.getText();
		if (source == btnaj)
		{
			if (n.isEmpty() && i.isEmpty())
			{
				JOptionPane.showMessageDialog(null, "Vous devez entrer le nom et l'Id pour ajouter un medicament");
			}
			else
			{	
				MedicamentDAO mDAO = new MedicamentDAO();
				Medicament m = new Medicament(Integer.parseInt(i),n);
				
				if (mDAO.RechercherParNom(n) == null && mDAO.RechercherParId(Integer.parseInt(i))==null ) {
					
				Medicament maj = mDAO.Ajouter(m);
				textNom.setText(" ");
				textId.setText(" ");
				JOptionPane.showMessageDialog(null, n+"   Ajouté");}
				else {
					JOptionPane.showMessageDialog(null, "Medicament existe déja");
				}
			}
		}
		else
		{
			if (n.isEmpty())
			{
				JOptionPane.showMessageDialog(null, "Vous devez entrer le nom  pour supprimer un medicament");
			}
			else 
			{
				MedicamentDAO mDAO = new MedicamentDAO();

				Medicament m = mDAO.RechercherParNom(n);
				if (m != null) {
				Medicament msupp = mDAO.Supprimer(m);
				textNom.setText(" ");
				textId.setText(" ");
				JOptionPane.showMessageDialog(null, n+"   Supprimé");}
				else {
					JOptionPane.showMessageDialog(null, "N'existe pas");
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		new AjoutSuppMed().setVisible(true);
	}
}