package singleton;

public class mainFib{
    public static void main(String[] args){
        Fib f = Fib.getInstance();
        System.out.print("f " + f.getValue());
        System.out.println(" " + f.getValue());
        //richiede una nuova istanza
        Fib f2 = Fib.getInstance();
        System.out.print("f2 " + f2.getValue());
        System.out.println(" " + f2.getValue());
    }
}
