package creational_patterns.Singleton;


// Eager initialization: The instance of the singleton class is created at the time of class loading.
// This approach is simple and thread-safe,
// but it may lead to resource wastage if the instance is not used.
public class StaticSingleton {
    private static final StaticSingleton instance =  new StaticSingleton();

    private  StaticSingleton(){}

    public static StaticSingleton getInstance(){
        return instance;
    }
}
