import java.time.LocalDateTime;
public class Venduto implements StatoBiglietto {
    private final String nome;
    private LocalDateTime dataPagam;
    public Venduto(String n){
        nome = n;
    }
    @Override
    public void mostra() {
        System.out.println("VEND Nome: " + nome);
    }

    @Override
    public StatoBiglietto intesta(String s) {
        System.out.println("VEND non può cambiare il nome nello stato venduto");
        return this;
    }

    @Override
    public StatoBiglietto paga() {
        if(dataPagam == null){
            dataPagam = LocalDateTime.now();
            System.out.println("VEND pagamento effettuato");
        }
        else{
            System.out.println("VEND il biglietto era già stato pagato");
        }
        return this;
    }

    @Override
    public StatoBiglietto cancella() {
        System.out.println("VEND non può cambiare stato da venduto a disponibile");
        return this;
    }
    
}
