package learnThread.race;

import java.util.concurrent.atomic.AtomicInteger;

public class ValueStorage {
    private static AtomicInteger value = new AtomicInteger();
    public static void incrementValue(){
        value.incrementAndGet();
    }
    public static int getValue(){
        return value.intValue();
    }
}
