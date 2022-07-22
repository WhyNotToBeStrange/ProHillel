package Home6;

public class Recursion {

    static void revers(int num) {
        System.out.print(num + " ");
        num--;
        if (num >= 1) {
            revers(num);
        }
    }

    static void show(int num2) {

        if (num2 >= 1) {
            show(num2 - 1);
            System.out.print(num2 + " ");
        }
    }

    static int sumNumbers(int num3) {
        if (num3 < 10)
            return num3;
        else
            return (num3 % 10) + sumNumbers(num3 / 10);
    }

    public static void main(String[] args) {
        show(5);
        System.out.println(" ");
        revers(5);
        System.out.println(" ");
        int num = sumNumbers(123456789);
        System.out.println(num);
    }

}
