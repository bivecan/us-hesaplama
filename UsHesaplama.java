import java.util.Scanner;

public class UsHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Üssü alınacak sayı: ");
        int n= scan.nextInt();

        System.out.println("Üs: ");
        int k= scan.nextInt();

        int sonuc = 1;

        for(int i=1; i<=k; i++){
            sonuc *=n;
        }

        System.out.println("Sonuc: " + sonuc);
    }
}
