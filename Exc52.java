import java.util.Scanner;

public class Exc52 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = Input.nextInt();

        int[] array = new int[100];
                System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = Input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"] = ");
            System.out.println(array[i]);
        }






    }
}
