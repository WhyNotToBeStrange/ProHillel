package Home3;

public class Ex4 {
    public static void main(String[] args) {
        int n = 4;
        int a = n * n;
        int count = 0;
        for (int i = 1; i <= a; i++) {
            System.out.print(i+" ");
            count ++;
            if(count == 4){
                System.out.println(" ");
                count = 0;
            }
        }
    }
}
