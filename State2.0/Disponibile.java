
public class Disponibile implements StatoBiglietto{
    @Override public void mostra() {

    }
    @Override public StatoBiglietto intesta(String s){
        System.out.println("DISP cambia stato da Disponibile a Bloccato");
        return new Bloccato().intesta(s);
    }
    @Override public StatoBiglietto paga(){
        System.out.println("DISP non si può pagare, bisoga prima intestarlo");
        return this;
    }
    @Override public StatoBiglietto cancella(){
        System.out.println("DISP lo stato era già disponibile");;
        return this;
    }
}
