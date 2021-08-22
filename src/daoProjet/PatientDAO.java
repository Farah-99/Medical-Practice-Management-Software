package daoProjet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import daoProjet.IDAO;

import modelProjet.Patient;

public class PatientDAO implements IDAO<Patient> {
	@Override
	public Patient Ajouter(Patient p) {
		Connection c = ConnexionBD.getConnection();
		if (c != null) {
			try {
				c.setAutoCommit(false);
				PreparedStatement ps = c.prepareStatement(
						"insert into \"Patient\" (\"codeP\", nom, prenom, cin, \"dateNaissance\", profession, \"nomJeuneFille\", ville, "
						+ "adresse, \"numTel\", \"codePostal\", \"dateCreation\" ) values (?,?,?,?,?,?,?,?,?,?,?,?);");
				System.out.println(p.getCodeP()+p.getNom());
				ps.setLong(1, p.getCodeP());
				ps.setString(2, p.getNom());
				ps.setString(3, p.getPrenom());
				ps.setLong(4, p.getCin());
				ps.setString(5, p.getDaNais());
				ps.setString(6, p.getProfession());
				ps.setString(7, p.getNomJeuneFille());
				ps.setString(8, p.getVille());
				ps.setString(9, p.getAdresse());
				ps.setLong(10, p.getNumTel());
				ps.setLong(11, p.getCodePostal());	
				ps.setString(12, p.getDateCr());
                System.out.println(ps);
				int res = ps.executeUpdate();
				if (res != 0) { 
					c.commit();
					return p;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	


	@Override
	public Patient Supprimer(Patient obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient Modifier(Patient obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient RechercherParId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
