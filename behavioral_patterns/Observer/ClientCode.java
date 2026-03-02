package behavioral_patterns.Observer;

public class ClientCode {
    public static void main(String[] args) {
        FitnessData fitnessData = new FitnessData();
        LiveActivityDisplay display = new LiveActivityDisplay();
        ProgressLogger logger = new ProgressLogger();
        GoalNotifier notifier = new GoalNotifier();

        fitnessData.registerObserver(display);
        fitnessData.registerObserver(logger);
        fitnessData.registerObserver(notifier);

        fitnessData.newFitnessDataPushed(500,5,20);
        fitnessData.newFitnessDataPushed(9800,83,350);
        fitnessData.newFitnessDataPushed(101000,90,234);

        fitnessData.removeObserver(logger);
        notifier.reset();
        fitnessData.dailyReset();

    }
}
