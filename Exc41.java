import java.util.Scanner;

public class Exc41 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = Input.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.print(fibonacci(i) + " ");

        }
    }

    public static int fibonacci(int n) {
        int pre0 = 0;
        int pre1 = 1;
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                result = 0;
            } else if (i == 1) {
                result = 1;
            } else {
                result = pre0 + pre1;
                pre0 = pre1;
                pre1 = result;


            }

        }
        return result;
    }

}

