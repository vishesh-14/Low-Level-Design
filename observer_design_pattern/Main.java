package observer_design_pattern;

public class Main {
    public static void main(String[] args) {
        Observable observable = new ObservableConceret();
        Observer mobile = new MobileObserver("1234567890");
        Observer email = new EmailObserver("abc@gmail.com");
        observable.addObserver(mobile);
        observable.addObserver(email);
        System.out.println("Initial data set:");
        observable.setData();
        System.out.println("After Removing  One  Observer");
        observable.removeObserver(email);
        observable.setData();

    }
}
