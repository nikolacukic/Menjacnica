package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejs.MenjacnicaInterfejs;
import valuta.Kurs;
import valuta.Valuta;

public class MenjacnicaImplement implements MenjacnicaInterfejs {


	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override

	public void dodajKursNaDan(Valuta valuta, Kurs kurs, GregorianCalendar dan) {
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).equals(valuta)){
				LinkedList<Kurs> kursevi = valute.get(i).getKursNaDan();
				for (int j = 0; j < kursevi.size(); j++) {
					if(kursevi.get(j).getDatumRacunanjaKursa().get(GregorianCalendar.DATE) == dan.get(GregorianCalendar.DATE)){
						throw new RuntimeException("Postoji kurs za taj datum");
			 	}
			 		}
			 	valute.get(i).getKursNaDan().add(kurs);
			 	return;
			 }

		}
		
	}

	@Override
	public void izbrisiKursNaDan(Valuta valuta, GregorianCalendar dan) {
	
		for (int i = 0; i < valute.size(); i++) {
			if( valute.get(i).equals(valuta)){
				LinkedList<Kurs> kursevi = valute.get(i).getKursNaDan();
			 	for (int j = 0; j < kursevi.size(); j++) {
			 		if(kursevi.get(j).getDatumRacunanjaKursa().get(GregorianCalendar.DATE) == dan.get(GregorianCalendar.DATE)){
			 			valute.get(i).getKursNaDan().remove(j);
			 			return;
			 		}
			 	}
			 }
		}
	}

	@Override
	public Kurs pronadjiKurs(Valuta valuta, GregorianCalendar dan) {
		for (int i = 0; i < valute.size(); i++) {
			 if( valute.get(i).equals(valuta)){
			 	LinkedList<Kurs> kursevi = valute.get(i).getKursNaDan();
			 	for (int j = 0; j < kursevi.size(); j++) {
			 		if(kursevi.get(j).getDatumRacunanjaKursa().get(GregorianCalendar.DATE) == dan.get(GregorianCalendar.DATE)){
			 			return valute.get(i).getKursNaDan().get(j);
			 		}
			 	}
			 }
		}
		throw new RuntimeException("Ne postoji kurs za taj datum");
	}

}
