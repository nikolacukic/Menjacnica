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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datumRacunanjaKursa == null) ? 0 : datumRacunanjaKursa.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kurs other = (Kurs) obj;
		if (datumRacunanjaKursa == null) {
			if (other.datumRacunanjaKursa != null)
				return false;
		} else if (!datumRacunanjaKursa.equals(other.datumRacunanjaKursa))
			return false;
		if (Double.doubleToLongBits(kupovni) != Double.doubleToLongBits(other.kupovni))
			return false;
		if (Double.doubleToLongBits(prodajni) != Double.doubleToLongBits(other.prodajni))
			return false;
		if (Double.doubleToLongBits(srednji) != Double.doubleToLongBits(other.srednji))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Kurs na dan: " + datumRacunanjaKursa + " Prodajni=" + prodajni + ", srednji=" + srednji
				+ ", kupovni=" + kupovni;
	}
}
