package daoProjet;


// Interface g�n�rique qui d�finit les m�thodes CRUD(Create, Research, Update and Delete) d'acc�s � la BD
public interface IDAO <T> {
	
	public T Ajouter(T obj);
    
	public T Supprimer(T obj);     
     
	public T Modifier(T obj);
     
	public T RechercherParId(int id);
	
	
}
