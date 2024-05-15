import java.util.Random;

public class PasswordMaker {
    private static final int MAGIC_NUMBER = 10;
    private static final String MAGIC_STRING;
    private final String name;
    private static PasswordMaker instance;
    private static int getInstanceCount = 0;
    private static final Random RANDOM = new Random();


    static {
        MAGIC_STRING = RandomStringGenerator.generateRandomString("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", 20);
    }

    private PasswordMaker(String name) {
        this.name = name;
    }


    public static synchronized PasswordMaker getInstance(String name) {
        getInstanceCount++;
        if (instance == null) {
            instance = new PasswordMaker(name);
        }
        return instance;
    }

    public static int getGetInstanceCount() {
        return getInstanceCount;
    }

    public String getPassword() {
        String alphabetForPassword = RandomStringGenerator.generateRandomString(MAGIC_STRING, 10);
        String randomPart = RandomStringGenerator.generateRandomString(alphabetForPassword, MAGIC_NUMBER);
        String numericPart = String.valueOf(/*name.length())+ */ RANDOM.nextInt(101));
        return randomPart + numericPart;
    }

    public void printPassword() {
        String password = getPassword();
        System.out.println("Generated Password: " + password);
    }

    public static void main(String[] args) {
        PasswordMaker passwordMaker1 = PasswordMaker.getInstance("JohnDoe");
        PasswordMaker passwordMaker2 = PasswordMaker.getInstance("JaneSmith");
        PasswordMaker passwordMaker3 = PasswordMaker.getInstance("Jasmin");


        System.out.println(passwordMaker1 == passwordMaker2);

        passwordMaker1.printPassword();
        passwordMaker2.printPassword();
        passwordMaker3.printPassword();

        System.out.println("Number of getInstance() calls: " + PasswordMaker.getGetInstanceCount());
    }
}
