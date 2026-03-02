package creational_patterns.Prototype;

import javax.sound.midi.Receiver;
import java.util.ArrayList;
import java.util.List;

public class RecipientList {
    private List<String> to;
    private List<String> cc;

    public RecipientList(List<String> to, List<String> cc) {
        this.to = to;
        this.cc = cc;
    }
    public RecipientList deepCopy(){
        return new RecipientList(new ArrayList<>(to), new ArrayList<>(cc));
    }
    public void addTo(String email){
        to.add(email);
    }
    public void addCc(String email){
        cc.add(email);
    }

    @Override
    public String toString() {
        return "RecipientList{" +
                "to=" + to +
                ", cc=" + cc +
                '}';
    }
}
