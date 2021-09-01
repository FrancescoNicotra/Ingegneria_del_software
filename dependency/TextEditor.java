/*
TextEdito conosce l'interfaccia SpCheck e non le sue implemtazioni. La
dependency injection permette il disaccoppiamento fra TextEditor e la
sottoclasse di SpCheck
*/
public class TextEditor {

  private SpCheck speller;

  public TextEditor(SpCheck sp) {
    speller = sp;
  }

  //inserisce una parola e controlla lo spelling
  public void put(String word) {
    if (speller.check(word)){
        System.out.println("lingua usata OK :D");
    } 
    else{ 
        System.out.println("lingua usata NON OK D:");
    }
  }
}
