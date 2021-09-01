package Carrello;

import java.util.ArrayList;
import java.util.List;

//Carrelo è il composite
public class Carrello implements Prodotto {

  private List<Prodotto> nestedElem = new ArrayList<>();

  @Override
  public void print() {
    System.out.println("Caarrello -------- -------- ------- -------");
    for (Prodotto res : nestedElem) {
      res.print();
    }
    System.out.println("------------ --------- -------- ---------");
    System.out.println(
      "------------ --------- -------- --------- Prezzo totale: " + getPrezzo()
    );
  }

  @Override
  public float getPrezzo() {
    return nestedElem.stream().map(e -> e.getPrezzo()).reduce(0f, Float::sum);
  }

  @Override
  public int getPeso() {
    return nestedElem.stream().map(e -> e.getPeso()).reduce(0, Integer::sum);
  }

  @Override
  public void add(Prodotto p) {
    System.out.println("Carrello: add()");
    nestedElem.add(p);
  }

  @Override
  public void remove(Prodotto p) {
    nestedElem.remove(p);
  }
}
