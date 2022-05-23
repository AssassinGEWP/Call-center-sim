import java.util.Random;

public class NumberGenerator {
    int Number;
    public int GenerateCall() {
        Random rand = new Random();
        int upperbound = 11;
        int int_random = rand.nextInt(upperbound);
        return int_random;
    }
    public int GenerateSerivceTime() {
        Random rand = new Random();
        int upperbound = 31;
        int int_random = rand.nextInt(upperbound);
        return int_random;
    }
}
