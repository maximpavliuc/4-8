import java.util.Random;

public class RandomStringGenerator {
    private static final Random RANDOM = new Random();

    public static String generateRandomString(String alphabet, int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(alphabet.charAt(RANDOM.nextInt(alphabet.length())));
        }
        return sb.toString();
    }
}
