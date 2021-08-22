package daoProjet;


// Interface générique qui définit les méthodes CRUD(Create, Research, Update and Delete) d'accès à la BD
public interface IDAO <T> {
	
	public T Ajouter(T obj);
    
	public T Supprimer(T obj);     
     
	public T Modifier(T obj);
     
	public T RechercherParId(int id);
	
	
}
