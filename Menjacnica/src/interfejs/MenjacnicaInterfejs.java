package interfejs;

import java.util.GregorianCalendar;

import valuta.Kurs;

public interface MenjacnicaInterfejs {

		public void dodajKursNaDan(String valuta, Kurs kurs, GregorianCalendar dan);
		public void izbrisiKursNaDan(String valuta, GregorianCalendar dan);
		public Kurs pronadjiKurs(String valuta, GregorianCalendar dan);
}
