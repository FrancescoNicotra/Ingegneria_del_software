public class SpCheckItalian implements SpCheck {
    @Override
    public boolean check(String word){
        //TODO: dovrebbe usare il dizionario inglese e le regole per stemming
        //troncamento, etc.
        return word.equals("ciao");
    }
}
