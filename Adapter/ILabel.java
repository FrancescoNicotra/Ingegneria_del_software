package Adapter;

public interface ILabel {
    public String getNextLabel();
    public boolean checkUsed(int k);
    public void insertTag(String s);
}
