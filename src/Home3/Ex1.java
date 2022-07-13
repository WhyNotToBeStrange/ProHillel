package Home3;

public class Ex1 {
    public static void main(String[] args) {
        int[] k = {2, 4, 6, 3, -1, 1};
        int[] n = {4, 6, 3};

        for (int i = 0; i < n.length; i++) {
            int num = n[i];

            for (int j = 0; j <= k.length; j++) {
                if (num == k[j]) {

                    System.out.print(num + " ");
                    break;

                }
            }
        }
    }
}
