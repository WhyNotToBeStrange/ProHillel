package Home3;

public class Ex3 {
    private static int searchLength(int number) {
        int length = 0;
        while (number != 0) {
            number = (int) number / 10;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 22, 24, 44, 45, 33, 31, 55,123};
        boolean flag = false;
        int count = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            int[] num = new int[searchLength(arr[i])];
            count = arr[i];
            flag = true;
            for (int j = 0; j < searchLength(arr[i]); j++) {
                num[j] = count % 10;
                count /= 10;
            }
            for (int k = 0; k < num.length; k++) {
                for (int d = 0; d < num.length; d++) {
                    if (num[k] == num[d] && k != d) {
                        flag = false;

                    }

                }
            }

            if (flag == true) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}



