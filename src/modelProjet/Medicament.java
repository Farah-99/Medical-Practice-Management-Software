package modelProjet;

public class Medicament {
	long idMed;
	String nomMed;
	public Medicament() {
		// TODO Auto-generated constructor stub
		
		
	}
	public long getIdMed() {
		return idMed;
	}
	public void setIdMed(long idMed) {
		this.idMed = idMed;
	}
	public String getNomMed() {
		return nomMed;
	}
	public void setNomMed(String nomMed) {
		this.nomMed = nomMed;
	}
	
	public Medicament(long idMed, String nomMed) {
		super();
		this.idMed = idMed;
		this.nomMed = nomMed;
	}
	

}
