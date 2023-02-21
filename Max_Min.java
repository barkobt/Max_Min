import java.util.Scanner;
/*
Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

Senaryo
Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22
 */

public class Max_Min {
    public static void main(String[] args) {
        int n,j;
        int max=0, min=0;
        Scanner input = new Scanner (System.in);
        System.out.print("Girilecek Sayı Adedi:");
        n = input.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.print(i + ".Sayıyı Giriniz:");
            j = input.nextInt();

            if(i==1){
                max = j;
                min = j;
            }
            if(j>max){
                max = j;
            }
            if(j<min){
                min = j;
            }
        }
        System.out.println("En Büyük Sayı:" +max);
        System.out.println("En Küçük Sayı:" +min);

    }
}
