package Adapter;

public class LabelServer { //adaptee
    private int labelNum = 1;
    private String prefix;
    public LabelServer(String p){
        prefix = p;
    }
    public String serverNextLabel(){
        return prefix + labelNum++;
    }
    public int getCount(){
        return labelNum;
    }
    public void change(String s){
        prefix = s;
    }
}
