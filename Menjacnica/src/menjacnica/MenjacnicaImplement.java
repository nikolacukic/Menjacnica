package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.MenjacnicaInterfejs;
import valuta.Kurs;
import valuta.Valuta;

public class MenjacnicaImplement implements MenjacnicaInterfejs {

	private LinkedList<Valuta> valute = new LinkedList<Valuta>();
	@Override
	public void dodajKursNaDan(String valuta, Kurs kurs, GregorianCalendar dan) {
		for (int i = 0; i < valute.size(); i++) {
			 if( valute.get(i).getNaziv().equals(valuta)){
			 	LinkedList<Kurs> kursevi = valute.get(i).getKursNaDan();
			 	for (int j = 0; j < kursevi.size(); j++) {
			 		if(kursevi.get(j).getDatumRacunanjaKursa().get(GregorianCalendar.DATE) == dan.get(GregorianCalendar.DATE)){
			 			throw new RuntimeException("Vec postoji kurs za taj datum");
			 		}
			 	}
			 	valute.get(i).getKursNaDan().add(kurs);
			 	return;
			}
		}
		
	}

	@Override
	public void izbrisiKursNaDan(String valuta, GregorianCalendar dan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kurs pronadjiKurs(String valuta, GregorianCalendar dan) {
		// TODO Auto-generated method stub
		return null;
	}

}
