import jdk.internal.util.xml.impl.Input;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exc61 {

        Scanner w = new Scanner(System.in);
        Scanner h = new Scanner(System.in);
        public int witdh = w.nextInt();
        public int height = h.nextInt();


        public int getWitdh(){
            return witdh;
        }

        public void setWitdh(int witdh) {
            this.witdh = witdh;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
        public float Chuvi(){
            return (witdh + height)*2;
        }
        public float Dientich(){
            return witdh*height;
        }
        public void KiemTra() {
            if (witdh == height) {
                System.out.print("Đây là hình vuông");
            } else {
                System.out.print("Đây là hình chữ nhật");
            }
        }


        public static void main(String[] args) {

            Exc61 ChuVi = new Exc61();
            System.out.println(ChuVi.Chuvi());
            Exc61 DienTich = new Exc61();
            System.out.println(DienTich.Dientich());

        }



}
