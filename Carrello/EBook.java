//Ebook svolge il ruolo di Leaf
public class EBook implements Prodotto {
    private String titolo;
    private float prezzo;
    public EBook(String titol, float prez){
        titolo = titol;
        prezzo = prez;
    }
    @Override
    public void print(){
        System.out.println("EBook: " + titolo + "\tPrezzo: " + getPrezzo() + "€");
    }
    @Override
    public float getPrezzo(){
        return prezzo;
    }
    @Override
    public int getPeso(){
        return 0;
    }
    private float percSconto(){
        return 15;
    }
    @Override
    public void add(Prodotto p){
    }
    @Override
    public void remove(Prodotto p){
    }
}
