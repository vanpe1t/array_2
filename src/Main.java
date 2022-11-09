import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] arr = generateRandomArray();

    }
    public static int[] generateRandomArray() {

        Random random = new java.util.Random();
        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }

        return arr;
    }

}