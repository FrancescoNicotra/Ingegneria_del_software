import java.util.List;
import java.util.ArrayList;
public class Subject {
    private List<Observer> obs = new ArrayList<>();
    private boolean changed = false;
    public void notify(Object state){
        if(!changed) return;
        for(Observer o : obs) o.update(this, state);
        changed = false;
    }
    public void setChanged(){
        changed = true;
    }
    public void attach(Observer o){
        obs.add(o);
    }
    public void detach(Observer o){
        obs.remove(o);
    }
}
