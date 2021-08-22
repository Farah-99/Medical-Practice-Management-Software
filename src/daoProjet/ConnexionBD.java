package daoProjet;


import java.sql.*;

public class ConnexionBD {
	

	
	private static String url = "jdbc:postgresql://localhost:5432/Gestion_cabinet";
	private static String user = "postgres";
	private static String passwd = "hadoula123";

	private static Connection cn = null;

	
	private ConnexionBD() {
			String nomDriver = "org.postgresql.Driver";
			try{
				 Class.forName(nomDriver);
				}
			catch(ClassNotFoundException cnfe){
				 System.out.println("La classe "+nomDriver+" n'a pas �t� trouv�e");
				 cnfe.printStackTrace();
				}
		
		try { 
			cn = DriverManager.getConnection(url, user, passwd);
		} 
		catch ( Exception e ) {
			e.printStackTrace();  
		}
	}

	// On n'instancie la connexion que si le cn est different de null
	public static Connection getConnection() {
		if (cn == null) {
			new ConnexionBD();
		}
		return cn;
	}
	// M�thode de fermeture de la connexion
	public static void Fermer() {
		if (cn != null) {
			try {  cn.close(); }
			catch (SQLException e) { 
				e.printStackTrace();  
			}
		}
	}
}
