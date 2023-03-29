public class MoodAnalyser extends Exception{
    public MoodAnalyser Exception(String message, Exception_Type type) {
        super(message);
    }

    public enum Exception_Type {
        NULL, EMPTY;
    }

}