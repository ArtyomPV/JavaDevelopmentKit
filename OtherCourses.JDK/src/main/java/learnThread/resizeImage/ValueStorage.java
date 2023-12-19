package learnThread.resizeImage;

public class ValueStorage {
    private static int value;
    public static void incrementValue(){
        value += 1;
    }
    public static int getValue(){
        return value;
    }
}
