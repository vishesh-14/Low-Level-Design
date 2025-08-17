package observer_design_pattern;

public class EmailObserver implements Observer{
    private String email;
    EmailObserver(String email) {
        this.email = email;
    }
    @Override
    public void update(String message) {
        System.out.println("Sending email to "+email+" notification: " + message);
    }
}
