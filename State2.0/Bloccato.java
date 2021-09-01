public class Bloccato implements StatoBiglietto {
    private String nome;

    @Override
    public void mostra() {
        System.out.println("BLOC nome: " + nome);
    }

    @Override
    public StatoBiglietto intesta(String s) {
        System.out.println("BLOC inserito nuovo intestatario");
        nome = s;
        return this;
    }

    @Override
    public StatoBiglietto paga() {
        System.out.println("BLOC Cambia stato da bloccato a venduto");
        return new Venduto(nome).paga();
    }

    @Override
    public StatoBiglietto cancella() {
        System.out.println("BLOC Cambia stato da bloccato a disponibile");
        return new Disponibile();
    }
}
