public class Persona {
    private String nome;
    private String cognome;
    private String Tel;
    private String luogo;
    Persona(String n,String c,String t,String l){
        nome = n;
        cognome = c;
        Tel = t;
        luogo = l;

    }
    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public String getTelefono(){
        return Tel;
    }
    public String getLuogo(){
        return luogo;
    }
}
