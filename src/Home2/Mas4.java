package Home2;

public class Mas4 {
    public static void main(String[] args) {


        int array[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 18, 15};


        int maxValue = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        int minValue = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                maxValue = array[i];
            }
        }
        System.out.println("Максимальное число-"+maxValue);
        System.out.println("Минимальное число-"+minValue);
    }
}



