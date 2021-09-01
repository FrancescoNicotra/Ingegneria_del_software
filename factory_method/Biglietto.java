//biglietto è un client del product Posto
public class Biglietto {
    String nome;
    private final Posto pos;
    public Biglietto(Posto p){
        pos = p;
    }
    public void inTesta(String s){
        nome = s;
    }
    public String getNome(){
        return nome;
    }
    public int getCosto(){
        return pos.getCosto();
    }
}
