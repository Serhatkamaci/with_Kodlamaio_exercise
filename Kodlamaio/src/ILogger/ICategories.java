package ILogger;

import Managers.Managers;

public class ICategories implements ILogger{
    private String name;
    public void dataBaseLogger(String name) {
        this.name=name;
        System.out.println("\nAdded to database --> "+name);
    }

    @Override
    public void fileLogger(String name) {
        this.name=name;
        System.out.println("Added to file --> "+name);
    }

    @Override
    public void mailLogger(String name) {
        this.name=name;
        System.out.println("Added to mail --> "+name);
    }
}
