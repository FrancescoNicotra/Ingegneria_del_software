package CalcolaImporti;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

/*public class CalcolaImporti {//versione 0.0.1
    private final List<String> importi = new ArrayList<>();
    //List e ArrayList sono tipi della libreria java
    private float totale;
    public float calcola(String c,String n) throws IOException { //metodo
        LineNumberReader f = new LineNumberReader(new FileReader(new File(c,n)));
        //Lettura dile tramite le API java: file,FileReader, LineNumberReader
        totale = 0;
        while(true){
            final String riga = f.readLine(); //legge una riga dal file
            if (null == riga) break; //esce dal ciclo
            importi.add(riga); //aggiunge in lista
            totale += Float.parseFloat(riga); //converte da String a float
        }
        f.close();
        return totale;
    }
}

Progressi fatti:
 - lettura da file
 - calcolo del totale
da fare:
 - controlli su valori unici
 - estrazione del massimo
*/
/*public class CalcolaImporti{ //versione 0.0.2
    private final List<String> importi = new ArrayList<>();
    private float totale, massimo;

    public float calcola(String c, String n) throws IOException {
        LineNumberReader f = new LineNumberReader(new FileReader(new File(c,n)));

        totale = massimo = 0;
        while(true){
            final String riga = f.readLine(); //legge una riga dal file
            if(null == riga) break; //esce dal ciclo
            importi.add(riga); //inserisce in lista
            float x = Float.parseFloat(riga); //converte da String a float
            totale += x; //aggiorna totale
            if(massimo < x) massimo = x; //aggiorna massimo
        }
        f.close(); //chiude file
        return totale; //restituisce il totale al chiamante
    }
}
Progressi fatti: 
    - lettura da file
    - calcolo totale
    - estrazione massimo
da fare:
    - controllo su valori unici

*/

public class CalcolaImporti { //versione 0.1

  private final List<String> importi = new ArrayList<>();
  private float totale, massimo;

  public float calcola(String c, String n) throws IOException {
    LineNumberReader f = new LineNumberReader(new FileReader(new File(c, n)));

    totale = massimo = 0;
    while (true) {
      final String riga = f.readLine();
      if (null == riga) break;
      if (!importi.contains(riga)) {
        importi.add(riga);
        float x = Float.parseFloat(riga);
        totale += x;
        if (massimo < x) massimo = x;
      }
    }
    f.close();
    return totale;
  }
}
/*
Progressi fatti: 
    - lettura da file
    - calcolo totale
    - estrazione massimo
    - controllo su valori unici

/* la versione 0.1 è uno spaghetti code, in quanto il codice è monolitico,
ovvero, fa troppe cose in unico flusso. Quindi non è un codice OO. 
Di conseguenza non può essere riutilizzato, nè può essere verificata la
correttezza
*/ 