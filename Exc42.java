import java.util.Scanner;

public class Exc42 {
    public static void main(String[] args) {
        System.out.print("Stars Tower");
        Scanner sao = new Scanner(System.in);
        int row = sao.nextInt();
        int column = 2*row - 1;

        for (int i = 1; i <= row; i++){
            int NumberofStar = 2*i-1;
            for (int j = 1; j <= column; j++){
                if (j<=(column-NumberofStar)/2 || j>(column-NumberofStar)/2 + NumberofStar){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }
}
