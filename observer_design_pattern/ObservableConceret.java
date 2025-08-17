package observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class ObservableConceret implements  Observable{
    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer Observer) {
        if (Observer != null && !observers.contains(Observer)) {
            observers.add(Observer);
        }
    }

    @Override
    public void removeObserver(Observer Observer) {
        if (Observer != null && observers.contains(Observer)) {
            observers.remove(Observer);
        }
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer observer : observers) {
            observer.update(message);
        }
    }

    @Override
    public void setData() {
        String message = "Data has been updated!";
        notifyObservers(message);
    }
}
