package ILogger;

public class IInstructors implements ILogger{
    @Override
    public void dataBaseLogger(String name) {
        System.out.println("\nAdded to database --> "+name);
    }

    @Override
    public void fileLogger(String name) {
        System.out.println("Added to file --> "+name);
    }

    @Override
    public void mailLogger(String name) {
        System.out.println("Added to mail --> "+name);
    }
}
