import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //Değiskenleri olustur
        int mat , fizik , kimya , tarih , turkce;

           //Scanner sinifimizi tanimladik
           Scanner inp = new Scanner(System.in);

           //Kullanicidan degerleri al.
            System.out.print("Matematik Notumuz");
            mat = inp.nextInt();

        System.out.print("Fizik Notumuz");
        fizik = inp.nextInt();

        System.out.print("Kimya Notumuz");
       kimya = inp.nextInt();

        System.out.print( "Tarih Notumuz");
        tarih = inp.nextInt();

        System.out.print("Turkce Notumuz");
        turkce = inp.nextInt();

        int toplam = (mat + fizik + kimya + tarih + turkce);
        double sonuc = toplam/6 ;
        System.out.println(sonuc);







    }
}
