package helpers;

import java.util.Random;

public class RandomTestData {

    private static int min;
    private static int max;

    private static Random random;

    public static boolean getRandomBoolean() {
        return random.nextBoolean();
    }


    public static int randomNum() {
        random = new Random();
        return random.nextInt(max + 1 - min) - min;
    }
}
