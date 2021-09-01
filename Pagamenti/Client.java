package Pagamenti;

import java.io.IOException;

public class Client {
	public static void main(String[] args) {
		System.out.println("inizio esecuzione");
		Paga p = new Paga();

		try {
			p.leggiFile("csvfiles", "Importi.csv");
		} catch (IOException e) {
				// nel caso in cui il file non venisse trovato
		}
		
		System.out.println("massimo "+ p.calcolaMassimo());
		System.out.println("somma "+ p.calcolaSomma());
	}
}
