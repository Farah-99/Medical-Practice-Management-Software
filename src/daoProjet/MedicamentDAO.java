package daoProjet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelProjet.Medicament;

public class MedicamentDAO implements IDAO<Medicament> {

	@Override
	public Medicament Ajouter(Medicament m) {
	
		Connection c1 = ConnexionBD.getConnection();
		try {
			c1.setAutoCommit(false);
			PreparedStatement ps = c1.prepareStatement("insert into medicament (\"idMed\" , \"nomMed\" ) values (?,?) ;")	;	
					ps.setLong(1, m.getIdMed());
					ps.setString(2, m.getNomMed());
					
					int res = ps.executeUpdate();
					if (res != 0) { 
						c1.commit();
						return m;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
		return null;
	}

	@Override
	public Medicament Supprimer(Medicament obj) {
		
				Connection c = ConnexionBD.getConnection();
				
				if (c != null) {
					try {
						c.setAutoCommit(false);
						PreparedStatement ps = c.prepareStatement("delete from medicament where \"nomMed\"=?;");
						ps.setString(1, obj.getNomMed());
						int res = ps.executeUpdate();				
						if (res != 0) { 
							c.commit();
							return obj;
						}
					} catch (SQLException e) { e.printStackTrace();  }
					catch (Exception e) { e.printStackTrace();  }
				}
				return null;
	}

	@Override
	public Medicament Modifier(Medicament obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Medicament RechercherParId(int id) {
		Medicament m = null;

		Connection c = ConnexionBD.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("select \"nomMed\" from medicament where \"idMed\"=?;");
				ps.setInt(1, id);
				ResultSet res = ps.executeQuery();
				if (res.next()) {
					m = new Medicament(id, res.getString(1));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return m;
	}
	
	public Medicament RechercherParNom(String nom) {
		Medicament m = null;
		
		Connection c = ConnexionBD.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("select \"idMed\" from medicament where \"nomMed\"=?;");		
				ps.setString(1, nom);
				ResultSet res = ps.executeQuery();
				if (res.next()) { 
					m = new Medicament(res.getLong(1), nom);
				}
			} catch (SQLException e) { e.printStackTrace();  }
			catch (Exception e) { e.printStackTrace();  }
		}
		return m;
		
		
	}
	
}