package daoProjet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelProjet.*;

public class ConsultationDAO implements IDAO<Consultation> {

	@Override
	public Consultation Ajouter(Consultation c) {
		Connection c1 = ConnexionBD.getConnection();
		try {
			c1.setAutoCommit(false);
			PreparedStatement ps = c1.prepareStatement("insert into consultation (\"codeP\" , type , remarques ) values (?,?,?) ;")	;	
					ps.setLong(1, c.getCodeC());
					ps.setString(2, c.getType());
					ps.setString(3, c.getRemarques());
					int res = ps.executeUpdate();
					if (res != 0) { 
						c1.commit();
						return c;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
		return null;
			}

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	@Override
	public Consultation Supprimer(Consultation obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Consultation Modifier(Consultation obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Consultation RechercherParId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
