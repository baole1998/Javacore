import java.sql.SQLOutput;
import java.util.Scanner;

public class Exc51 {
    public static void main(String[] args){
        int num, start, end, i, rem, temp, counter=0;

        Scanner Input = new Scanner(System.in);
        System.out.print("Nhập số đầu của dãy: ");
        start = Input.nextInt();
        System.out.print("Nhập số cuối của dãy: ");
        end = Input.nextInt();
        Input.close();


        for (i = start + 1; i < end;i++ ){
            temp = i;
            num = 0;
//            while (temp != 0){
//                rem = temp%10;
//                num = num + rem*rem*rem;
//                temp=temp/10;
//            }
            int pow = String.valueOf(i).length();
            while (temp != 0){
                rem = temp%10;
                int total = 1;
                for (int j = 1; j <= pow; j++) {
                    total = total*rem;
                }
                num = num + total;
                temp=temp/10;
            }
            if(i == num){
                if( counter == 0){
                    System.out.println("Dãy số Amstrong từ "+ ""+ start +" "+ "đến"+" " + end +": ");
                }
                System.out.print(i + " ");
                counter++;
            }
        }
        if(counter == 0){
            System.out.print("Không có số nào là số Amstrong bắt đầu từ"+start+"đến"+ end);
        }
    }
}