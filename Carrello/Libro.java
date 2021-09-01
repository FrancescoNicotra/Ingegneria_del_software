//Libro svolge il ruolo di Lead per il design pattern
public class Libro implements Prodotto {
    private String titolo;
    private float prezzo;
    private int peso;
    public Libro(String titol,float prez,int pes){
        titolo = titol;
        prezzo = prez;
        peso = pes;
    }
    @Override
    public void print(){
        System.out.println("Libro: " + titolo + "\tPrezzo: " + getPrezzo() + "€");
    }
    @Override
    public float getPrezzo(){
        return prezzo;
    }
    @Override
    public int getPeso(){
        return peso;
    }
    public void add(Prodotto p){
    }
    public void remove(Prodotto p){
    }
}
