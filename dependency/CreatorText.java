import java.util.ArrayList;
import java.util.List;
public class CreatorText {
    private static List<TextEditor> pool = new ArrayList<>();
    public static TextEditor getEng(){
        System.out.println("Crea un TextEditor con English");
        return new TextEditor(new SpCheckEnglish());
    }
    public static TextEditor getIta(){
        System.out.println("Crea un TextEditor con Italiano");
        return new TextEditor(new SpCheckItalian());
    }
    //TODO: Aggiornare il diagramma UML delle classi
    /** ritorna, se esiste, una istanza dal pool */
    public static TextEditor getFromPool(){
        if(!pool.isEmpty()) return pool.remove(0);
        return new TextEditor(new SpCheckEnglish());
    }
    public static void release(TextEditor t){
        pool.add(t);
    }
}
