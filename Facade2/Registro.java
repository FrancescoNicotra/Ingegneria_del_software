/**
 * Registro implementa il ruolo Facade per il sottosistema formato da Prestiti,
 * Permessi e Socio. Registro verifica se una certa azione su libro (presta o leggi)
 * è autorizzata e registra i dati rilevanti
 */
public class Registro {

  private final Permessi perm = new Permessi();
  private final Socio so = new Socio();
  private static Prestiti prt = new Prestiti();

  //notare che prestaLibro() chiama i metodi delle classi del sottositema
  public boolean prestaLibro(String nom, Libro lib) {
    System.out.println("Registro: presta");
    if (so.verificaId(nom) && perm.sePrestabile(nom)) {
      System.out.println("Registro: prestabile");
      prt.registra(nom, lib.getTitolo());
      return true;
    }
    return false;
  }

  public boolean leggiLibro(Libro lib) {
    System.out.println("Registro: leggi");
    final String nomePers = prt.trovaPersona(lib.getTitolo());
    System.out.println(
      "Registro: persona che in prestito il libro " + nomePers
    );
    return (so.verificaId(nomePers) && perm.seLeggibile(nomePers));
  }
}
