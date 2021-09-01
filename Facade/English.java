import java.util.Arrays;
import java.util.List;
public class English {
    private String text = "";
    private List<String> d = Arrays.asList("Alright","Hello","Understood","Yes");
    public boolean test(String s){
        return d.contains(s);
    }
    public void add(String s){
        text = text + " " + s;
    }
    public String getText(){
        return text;
    }
    public int getIndex(String s){
        return d.indexOf(s);
    }
    public void printText(){
        System.out.println(text);
    }
}
