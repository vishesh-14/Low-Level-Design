package observer_design_pattern;

public interface Observable {
    void addObserver (Observer Observer);
    void removeObserver (Observer Observer);
    void notifyObservers(String message);
    void setData();
}
