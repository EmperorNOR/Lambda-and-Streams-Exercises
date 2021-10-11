package oppgave3;

public class Ansatt {
	
	private String fornavn;
	private String etternavn;
	private String stilling;
	private int aarslonn;
	Kjonn kjonn;
	
	
	
	public Ansatt(String fornavn, String etternavn, String stilling, int aarslonn, Kjonn kjonn) {
		super();
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.stilling = stilling;
		this.aarslonn = aarslonn;
		this.kjonn = kjonn;
	}

	@Override
	public String toString() {
		return "Ansatt [fornavn=" + fornavn + ", etternavn=" + etternavn + ", stilling=" + stilling + ", aarslonn="
				+ aarslonn + ", kjonn=" + kjonn + "]";
	}

	public Kjonn getKjonn() {
		return kjonn;
	}

	public void setKjonn(Kjonn kjonn) {
		this.kjonn = kjonn;
	}

	public String getFornavn() {
		return fornavn;
	}
	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}
	public String getEtternavn() {
		return etternavn;
	}
	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}
	public String getStilling() {
		return stilling;
	}
	public void setStilling(String stilling) {
		this.stilling = stilling;
	}
	public int getAarslonn() {
		return aarslonn;
	}
	public void setAarslonn(int aarslonn) {
		this.aarslonn = aarslonn;
	}

}
