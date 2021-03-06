package valuta;

import java.util.LinkedList;

public class Valuta {
	private String naziv;
	private String skraceniNaziv;
	private LinkedList<Kurs> kursNaDan;
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv.isEmpty() || naziv == null) throw new RuntimeException("Naziv ne sme biti prazan string ili null");
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv.isEmpty() || skraceniNaziv==null) throw new RuntimeException("Skraceni naziv ne sme biti prazan string ili null");
		this.skraceniNaziv = skraceniNaziv;
	}
	public LinkedList<Kurs> getKursNaDan() {
		return kursNaDan;
	}
	public void setKursNaDan(LinkedList<Kurs> kursNaDan) {
		if(kursNaDan==null) throw new RuntimeException("Lista kurs ne sme imati null vrednost");
		this.kursNaDan = kursNaDan;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursNaDan == null) ? 0 : kursNaDan.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Valuta) {
			Valuta valuta = (Valuta) obj;
			if(valuta.getNaziv().equals(this.getNaziv()) && valuta.getSkraceniNaziv().equals(this.getSkraceniNaziv())) return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Valuta: " + naziv + " " + skraceniNaziv;
	}
}
