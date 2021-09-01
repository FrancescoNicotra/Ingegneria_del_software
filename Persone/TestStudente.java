package Persone;
public class TestStudente {
    public static void main(String[] args){
        Persona p = new Persona();
        p.setNome("Francesco", "Nicotra");
        Studente s = new Studente();
        s.setNome("Francesco", "Nicotra");
        s.setMatr("1000001741");
        s.nuovoEsame("Prog 2: ", 25);
        s.nuovoEsame("Fondamenti: ", 24);
        s.nuovoEsame("Prog 1: ", 27);
        s.printAll();
    }
}
