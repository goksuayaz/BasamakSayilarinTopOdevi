import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Bir sayı giriniz : ");
        int number = inp.nextInt();

        int basamakSayisi = 0, tempNumber = number;
        int basamakDegeri;
        int total = 0;



        while (tempNumber != 0){
            tempNumber /= 10;
            basamakSayisi++;
        }
        tempNumber = number;
        while ( tempNumber != 0){
            basamakDegeri = tempNumber % 10;

            total += basamakDegeri;
            tempNumber /= 10;

        }

        System.out.println("Basamak sayilarinin toplami :" + total);


    }

    }
