package valuta;

import java.util.GregorianCalendar;

public class Kurs {
	private GregorianCalendar datumRacunanjaKursa;
	private double prodajni;
	private double srednji;
	private double kupovni;
	
	public GregorianCalendar getDatumRacunanjaKursa() {
		return datumRacunanjaKursa;
	}
	public void setDatumRacunanjaKursa(GregorianCalendar datumRacunanjaKursa) {
		this.datumRacunanjaKursa = datumRacunanjaKursa;
	}
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		this.prodajni = prodajni;
	}
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		this.srednji = srednji;
	}
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		this.kupovni = kupovni;
	}
}
