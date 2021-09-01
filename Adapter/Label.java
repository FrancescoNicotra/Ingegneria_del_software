package Adapter;

import java.util.Arrays;
import java.util.List;
public class Label implements ILabel { //adapter
    private List<String> l = Arrays.asList("cat","dog","sheep");
    private LabelServer ls;
    private String p;
    public Label(String prefix){
        p = prefix;
        ls = new LabelServer(p);
    }
    @Override
    public String getNextLabel(){
        return ls.serverNextLabel();
    }
    @Override
    public boolean checkUsed(int k){
        return (ls.getCount() >= k);
    }
    @Override
    public void insertTag(String t){
        if(l.contains(t)) ls.change(t);
    }
}
