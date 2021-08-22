package modelProjet;

import java.util.Date;

public class Patient {
	long codeP, cin, numTel, codePostal;
	String daNais, dateCr;
	String nom, prenom, nomJeuneFille, ville, adresse, profession;
	
	

	public long getCodeP() {
		return codeP;
	}



	public void setCodeP(long code) {
		this.codeP = code;
	}



	public long getCin() {
		return cin;
	}






	public String getDaNais() {
		return daNais;
	}



	public void setDaNais(String daNais) {
		this.daNais = daNais;
	}



	public String getDateCr() {
		return dateCr;
	}



	public void setDateCr(String dateCr) {
		this.dateCr = dateCr;
	}



	public void setCin(long cin) {
		this.cin = cin;
	}



	public long getNumTel() {
		return numTel;
	}



	public void setNumTel(long numTel) {
		this.numTel = numTel;
	}



	public long getCodePostal() {
		return codePostal;
	}



	public void setCodePostal(long codePostal) {
		this.codePostal = codePostal;
	}






	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getNomJeuneFille() {
		return nomJeuneFille;
	}



	public void setNomJeuneFille(String nomJeuneFille) {
		this.nomJeuneFille = nomJeuneFille;
	}



	public String getVille() {
		return ville;
	}



	public void setVille(String ville) {
		this.ville = ville;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public String getProfession() {
		return profession;
	}



	public void setProfession(String profession) {
		this.profession = profession;
	}



	public Patient(long codeP, String nom, String prenom,  long cin,  String daNais, String profession, String nomJeuneFille, String ville,String adresse,  long numTel, long codePostal,
			String dateCr) {
		super();
		this.codeP = codeP;
		this.cin = cin;
		this.numTel = numTel;
		this.codePostal = codePostal;
		this.daNais = daNais;
		this.dateCr = dateCr;
		this.nom = nom;
		this.prenom = prenom;
		this.nomJeuneFille = nomJeuneFille;
		this.ville = ville;
		this.adresse = adresse;
		this.profession = profession;
	}



	
	
}
