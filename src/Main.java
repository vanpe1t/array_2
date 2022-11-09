import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] arr = generateRandomArray();

        System.out.println("Задача_1");

        double amountMonth = 0;

        for (int i = 0; i < arr.length; i++) {
            amountMonth += arr[i];
        }

        System.out.println("Сумма трат за месяц составила " + amountMonth + " рублей.");

        System.out.println();
        System.out.println("Задача_2");

        int minSumm = arr[0];
        int maxSumm = arr[0];

        for (int i = 0; i < arr.length; i++) {
            minSumm = (minSumm < arr[i]) ?  minSumm : arr[i];
            maxSumm = (maxSumm < arr[i]) ? arr[i] : maxSumm;
        }

        System.out.println("Минимальная сумма трат за день составила " + minSumm + " рублей. Максимальная сумма трат за день составила " + maxSumm +  " рублей.");

        System.out.println();
        System.out.println("Задача_3");

        double averageSumm = amountMonth / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + String.format("%.2f", averageSumm) + " рублей.");

        System.out.println();
        System.out.println("Задача_4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        System.out.println(Arrays.toString(reverseFullName));

        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[reverseFullName.length - 1 - i]);
        }

        System.out.println();

        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }

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