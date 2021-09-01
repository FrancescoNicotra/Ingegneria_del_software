public class Biglietto{
    private String codice = "XYZ", nome;
    private int prezzo = 100;
    private enum StatoBiglietto {DISPONIBILE,BLOCCATO,VENDUTO}
    private StatoBiglietto stato = StatoBiglietto.DISPONIBILE;
    //ogni operazione deve controllare in che stato si trova il biglietto
    public void prenota(String s){
        switch(stato){
            case DISPONIBILE:
                System.out.println("Cambia stato da disponibile a bloccato");
                nome = s;
                System.out.println("Inserito nuovo intestatario");
                stato = StatoBiglietto.BLOCCATO;
                break;
            case BLOCCATO:
                nome = s;
                System.out.println("Inserito nuovo intestatario");
                break;
            case VENDUTO:
                System.out.println("Non può cambiare il nome nello stato venduto");
                break;
        }
    }
    public void cancella(){
        switch(stato){
            case DISPONIBILE:
                System.out.println("Lo stato era già disponibile");
                break;
            case BLOCCATO:
                System.out.println("Cambia stato da bloccato a disponibile");
                nome = "";
                stato = StatoBiglietto.DISPONIBILE;
                break;
            case VENDUTO:
                System.out.println("Non può cambiare stato da venduto a disponibile");
                break;
        }
    }
    public void mostra(){
        System.out.println("Prezzo: "+ prezzo + " Codice: " + codice);
        if(stato == StatoBiglietto.BLOCCATO || stato == StatoBiglietto.VENDUTO){
            System.out.println("Nome: " + nome);
        }
    }
    public void compra(){
        switch(stato){
            case DISPONIBILE:
                System.out.println("Non si può pagare, bisogna prima intestarlo");
                break;
            case BLOCCATO:
                System.out.println("Cambia stato da bloccato a venduto");
                stato = StatoBiglietto.VENDUTO;
                System.out.println("Pagamento effettuato");
                break;
            case VENDUTO:
                System.out.println("Il biglietto era già stato venduto");
                break;
        }
    }
}