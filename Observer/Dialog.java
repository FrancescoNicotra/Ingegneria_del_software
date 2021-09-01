public class Dialog {
    private static final AddrBook book = new AddrBook();
    private static final Store st = new Store();
    private static final Persona p1 = new Persona("Oliver","Giroud","123456","NY");
    public static void main(String[] args) {
        book.attach(st);
        book.insert(p1);
        System.out.println(p1);
    }
}
