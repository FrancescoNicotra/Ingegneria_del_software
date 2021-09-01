import java.util.Arrays;
import java.util.List;

/**socio verifica se un'utente è registrato. Socio è una classe del sottoinsieme */

public class Socio {

  private final List<String> listaSoci = Arrays.asList("Alan", "Dan");

  public boolean verificaId(String nome) {
    System.out.println("Socio: in controlla id");
    return listaSoci.contains(nome);
  }
}
