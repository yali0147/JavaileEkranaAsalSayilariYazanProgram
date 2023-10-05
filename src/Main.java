import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Doğal Bir Sayı Giriniz : ");
        int n = inp.nextInt();
        if (n>0) {
            for (int i = 2; i <= n; i++) {
                boolean asal = true;
                for (int l = 2; l <= i / 2; l++) {
                    if (i % l == 0) {
                        asal = false;
                        break;
                    }
                }
                if (asal) {
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Yanlış bir değer girdiniz.");
        }
    }
}