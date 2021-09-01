package Persone;
public class MainEsami {
    public static void main(String[] args){
        Studente s = new Studente();
        s.setNome("Francesco", "Nicotra");
        s.setMatr("1000001741");
        s.nuovoEsame("Programmazione 2", 30);
        s.nuovoEsame("Programmazione 1", 24);
        s.nuovoEsame("Fondamenti di informatica", 23);
        s.printAll();
        Persona p = s;
        //p è dichiarata di tipo persona
        // al run time p punta all'istanza s
        p.printAll();
    }
}