import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        //taksimetreden bir değer alınacak bu değer 5 ise eğer 5x2.20 yapılacak
        //ama minimum taksimetre ücreti 10 tl olacağı için 5x2.20 yi minimum değişkeni ile toplamamız gerekicek
        //yani taksimetre,minimum,
        int km;
        double perKm=2.20, total, baslangicUcreti=10;

        //Girdi almamız gerekiyor
        Scanner input=new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz:");
        km=input.nextInt();
        
        total=km*perKm;
        total+=baslangicUcreti;

        total=(total<20) ? 20 :total;
        System.out.print("Toplam ödeminiz gereken tutar "+total+"TL");

    }
}
