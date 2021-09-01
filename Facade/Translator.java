public class Translator {//ruolo facade
    private English e = new English();
    private Italian i = new Italian();
    public void addEnglish(String s){
        if(e.test(s)){
            e.add(s);
            i.add(e.getIndex(s));
        }
    }
    public void multiPrinting(){
        System.out.print("Italiano: ");
        i.printText();
        System.out.print("English: ");
        e.printText();
    }
}
