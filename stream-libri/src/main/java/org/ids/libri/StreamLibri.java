package org.ids.libri;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.ids.libri.Libro.Categoria;

public class StreamLibri {

    // mi appoggio ad un factory method che genera a rotazione
    // la stessa lista di libri
    public List<Libro> generaListaLibri(int n) {
        return Stream.generate(Libreria::gen)
            .limit(n)
            .collect(Collectors.toList());
    }

    public long contaLibriCyberpunk(List<Libro> list) {
        return list.stream()
        .filter(t -> t.categoria.equals(Categoria.CYBERPUNK))
        .count();
    }

    public List<Libro> prezzoCompresoTra12e15(List<Libro> list) {
        List<Libro> risultato = list.stream()
        .filter(t -> t.prezzo >= 12 && t.prezzo <= 15)
        .collect(Collectors.toList());
        if(risultato.size() == 0)
        {
             return null;
        }
        return risultato;
    }

    public List<String> filtraListaTitoliLibriCyberpunkOppureFantasy(List<Libro> list) {
        List<String> risultato = list.stream()
        .filter(t -> t.categoria.equals(Categoria.CYBERPUNK) || t.categoria.equals(Categoria.FANTASY))
        .map(s->s.titolo)
        .collect(Collectors.toList());
        if(risultato.size() == 0){
            return null;
        }
        return risultato;

    }

    public List<Libro> generaListaLibriCyberpunk(int n) {
        List<Libro> risultato = Stream.generate(() -> new Libro("x",Categoria.CYBERPUNK,10))
        .limit(n)
        .collect(Collectors.toList());
        if(risultato.size() == 0){
            return null;
        }
        return risultato;
    }

    public boolean checkSePresenteBurningChrome(List<Libro> list) {
        List<Libro> risultato = list.stream()
        .filter(t -> t.titolo.equals("Burning Chrome"))
        .collect(Collectors.toList());
        if(risultato.size() == 0)
            return false;
        return true;
    }

    public int sommaCosti_reduce(List<Libro> list) {
        return list.stream()
                .map(Libro::getPrezzo)
                .reduce(0, (somma, t) -> somma + t);
    }

    public int sommaCosti_sum(List<Libro> list) {
        return IntStream.rangeClosed(0, list.size()-1)
                .map(x -> list.get(x).getPrezzo())
                .sum();
    }

    public double sommaCostiInDollari(double EUR_USD, List<Libro> list) {
        return sommaCosti_sum(list) *EUR_USD;
    }

    public Optional<Libro> libroMenoCaroDa12InSu(List<Libro> list) {
        return list.stream()
                .filter(f -> f.prezzo >= 12)
                .min(Comparator.comparing(Libro::getPrezzo));
    }

    public List<Libro> libriOrdinatiPerPrezzo(List<Libro> list) {
        return list.stream()
                .sorted(Comparator.comparing(Libro::getPrezzo))
                .collect(Collectors.toList());
    }

    // Titolo: "Harry Potter 1" "Harry Potter 2"... "Harry Potter n"
    // categoria: fantasy, prezzo: 15 euro
    public List<Libro> generaLibriHarryPotterDa15Euro(int n) {
        return IntStream.rangeClosed(1, n)
                        .mapToObj( i -> new Libro("Harry Potter " + i++, Categoria.FANTASY,15))
                        .collect(Collectors.toList());
    }

    public List<Libro> mescolaLista(List<Libro> list) {
        return libriOrdinatiPerPrezzo(list);
    }

    public Optional<Libro> primoPiuCaroDelPrecedente(List<Libro> list) {
        Optional<Libro> risultato = list.stream()
                            .max(Comparator.comparing(Libro::getPrezzo));
        return risultato;
    }

}
