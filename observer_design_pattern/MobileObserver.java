package observer_design_pattern;

public class MobileObserver implements Observer {
    private String mobileNumber;

    public MobileObserver(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void update(String message) {
        System.out.println("Sending SMS to " + mobileNumber + ": " + message);
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}
