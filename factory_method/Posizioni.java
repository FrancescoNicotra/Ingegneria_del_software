package factory_method;
//è un ConcreteCreator con un metodo factory
public class Posizioni extends GnrPosizioni {
    @Override
    public Posto getPosto(int tipo){
        //crea l'istanza di un concreteproduct
        if(1 == tipo) return new Palco();
        return new Platea();
    }
}
