package modelProjet;

public class Consultation {

	String type, remarques;
	long codeC;

	

	public long getCodeC() {
		return codeC;
	}

	public void setCodeC(long codeC) {
		this.codeC = codeC;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRemarques() {
		return remarques;
	}

	public void setRemarques(String remarques) {
		this.remarques = remarques;
	}



	public Consultation(long codeC, String type, String remarques) {
		super();
		this.codeC = codeC;
		this.type = type;
		this.remarques = remarques;
	}

}
