package ILogger;

public interface ILogger {
    void dataBaseLogger(String name);
    void fileLogger(String name);

    void mailLogger(String name);
}
