/**Libro è una classe del sistema */
public class Libro {

  private String titolo;

  public Libro(int x) {
    if (x == 1) titolo = "Curious George goes fishing"; else titolo =
      "Curious George at the zoo";
  }

  public String getTitolo() {
    System.out.println("Libro: Titolo");
    return titolo;
  }

  public String getAutore() {
    return "J. K. Rowling";
  }
}
