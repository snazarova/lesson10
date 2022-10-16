

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        //task1

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum);


        // task2

        int max = arr[0];
        int min = arr[0];
        for (int r : arr)

            System.out.println("Минимальная сумма трат за день составила" + min);
        System.out.println("Максимальная сумма трат за день составила " + max);

        // task3

        int average = 0;
        int all = 0;
        for (int i = 0; i < arr.length; i++) {
            all += i;
            average = all / arr.length;
        }
        System.out.println(average);
    }


public static void task4() {


    char[] reversFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

    for (int i = reversFullName.length - 1; i >= 0; i--) {
        System.out.print(reversFullName[i]);
    }
}
    }






