import java.util.Scanner;

public class WhileKelipatan05 {
    public static void main (String[]args){
        Scanner sc= new Scanner (System.in);
       
        int i= 1, total = 0, kelipatan, counter=0,  avg;

        System.out.print("Masukan bilangan kelipatan (1-9) : ");
        kelipatan = sc.nextInt();

        while(i <= 50){
         if (i % kelipatan == 0){
            total += i;
            counter ++;
         }
         i++;
        }
        avg = kelipatan / total;
        System.out.printf("Banyaknya bilangan %d dari 1 sanpai 50 adalah %d\n",kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n ",kelipatan, total);
        System.out.println("Rata-rata dari bilangan tersebut adalah " + avg);
        sc.close();

    }
    
}
