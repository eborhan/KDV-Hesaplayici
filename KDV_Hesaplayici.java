import java.util.Scanner;

public class KDV_Hesaplayici {
    public static void main(String[] args) {

        double tutar, kdvOran, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ürünün Tutarını Giriniz: ");
        tutar = input.nextDouble();

        kdvOran = (tutar <= 1000) ? 0.18 : 0.08;

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutar:  " + tutar);
        System.out.println("KDV oranı: " + kdvOran);
        System.out.println("KDV tutarı: "+ kdvTutar);
        System.out.println("Ürünün KDV'li tutarı: " + kdvliTutar);
    }

}
