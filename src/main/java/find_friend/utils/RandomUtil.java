package find_friend.utils;

import java.util.Random;

public class RandomUtil {
    public static String getRandom(int length) {

        if (length <= 0)
            return "";

        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(random.nextInt(10));
        }

        return sb.toString();
    }
}
