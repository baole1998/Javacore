public class Exc43 {
    public static void main(String[] args) {

        System.out.println("Chia hết cho 3");
    for(int i = 1; i <100; i++){
        if(i % 3 == 0)
        System.out.print(i +", ");
    }
        System.out.println(" ");

       System.out.println("Chia hết cho 5");
    for(int i = 1; i<100; i++){
        if (i % 5 == 0)
        System.out.print(i + ", ");
    }

        System.out.println(" ");

        System.out.println("Chia hết cho 3 & 5");
    for(int i = 1; i<100; i++){
       if (i % 5 == 0 && i % 3 == 0)
        System.out.print(i + ", ");
   }

    }
}
