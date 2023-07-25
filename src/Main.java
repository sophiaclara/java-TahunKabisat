import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tahun;
        System.out.print("Masukkan Tahun : ");
        tahun = input.nextInt();

        if (((tahun % 4 == 0) && !(tahun % 100== 0)) || (tahun % 400 == 0 ))
            System.out.println("Tahun " +tahun+ " adalah tahun kabisat");
        else
            System.out.println("Tahun " +tahun+ " bukan tahun kabisat");
    }
}