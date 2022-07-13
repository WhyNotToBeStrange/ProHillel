package Home3;

public class Ex2 {


    private static int searchLength(int number) {
        int length = 0;
        while (number != 0) {
            number = (int) number / 10;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {

        int array[] = {-7, 111, 22, 333, 4, 88888, 777777, 666};

        int maxValue = 0;
        int longest = searchLength(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (longest < searchLength(array[i])) {
                longest = searchLength(array[i]);
                maxValue = i;
            }
        }

        int minValue = 0;
        int shortest = searchLength(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (shortest > searchLength(array[i])) {
                shortest = searchLength(array[i]);
                minValue = i;
            }

        }
        System.out.println("Максимальное число-" + array[maxValue] + "  его длина=" + longest);
        System.out.println("Минимальное число-" + array[minValue] + "  его длина=" + shortest);
    }
}


