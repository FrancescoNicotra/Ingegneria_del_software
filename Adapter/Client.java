package Adapter;

public class Client {
    public static void main(String[] args) {
        ILabel s = new Label("LAB");
        String l = s.getNextLabel();
        if(l.equals("LAB1")){
            System.out.println("Test 1: Passed");
        }
        else{
            System.out.println("Test 1: Failed");
        } 
    }
}
