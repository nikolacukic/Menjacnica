package interfejs;

import java.util.GregorianCalendar;

import valuta.Kurs;
import valuta.Valuta;

public interface MenjacnicaInterfejs {

		public void dodajKursNaDan(Valuta valuta, Kurs kurs, GregorianCalendar dan);
		public void izbrisiKursNaDan(Valuta valuta, GregorianCalendar dan);
		public Kurs pronadjiKurs(Valuta valuta, GregorianCalendar dan);
}
