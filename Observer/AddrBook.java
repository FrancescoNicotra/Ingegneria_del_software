import java.util.List;
import java.util.ArrayList;
public class AddrBook extends Subject {
    private List<Persona> nomi = new ArrayList<>();
    public void insert(Persona p){
        if(nomi.contains(p)) return;
        nomi.add(p);
        setChanged(); //la prossima notifica avverrà
        notify(nomi); //notifica i ConcreteObserver
    }
    public Persona find(String cognome){
        for(Persona p : nomi){
            if(p.getCognome().equals(cognome)){
                return p;
            }
            System.out.println("AddrBook.find: Not found");
        }
        return null;
    }
}
