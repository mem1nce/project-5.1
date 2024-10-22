import java.util.Scanner;

public class Main {

    // Toplama işlemi metodu
    public static double toplama(double a, double b) {
        return a + b;
    }

    // Çıkarma işlemi metodu
    public static double çıkarma(double a, double b) {
        return a - b;
    }

    // Çarpma işlemi metodu
    public static double çarpma(double a, double b) {
        return a * b;
    }

    // Bölme işlemi metodu
    public static double bölme(double a, double b) {
        if (b == 0) {
            System.out.println("Hata: Sıfıra bölme hatası.");
            return 0; // Varsayılan değer döner
        }
        return a / b;
    }

    // Üslü sayı hesaplama metodu
    public static double üsHesaplama(double taban, double üs) {
        return Math.pow(taban, üs);
    }

    // Faktöriyel hesaplama metodu
    public static long faktoriyel(int n) {
        if (n < 0) {
            System.out.println("Hata: Negatif sayının faktöriyeli tanımlı değildir.");
            return -1; // Hata değeri döner
        }
        long sonuç = 1;
        for (int i = 1; i <= n; i++) {
            sonuç *= i;
        }
        return sonuç;
    }

    // Mod alma işlemi metodu
    public static double modAlma(double a, double b) {
        return a % b;
    }

    // Dikdörtgen alan ve çevre hesaplama metodu
    public static void dikdörtgenAlanVeÇevre(double uzunluk, double genişlik) {
        double alan = uzunluk * genişlik;
        double çevre = 2 * (uzunluk + genişlik);
        System.out.println("Dikdörtgenin Alanı: " + alan);
        System.out.println("Dikdörtgenin Çevresi: " + çevre);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bir işlem seçin:");
            System.out.println("1: Toplama");
            System.out.println("2: Çıkarma");
            System.out.println("3: Çarpma");
            System.out.println("4: Bölme");
            System.out.println("5: Üs Hesaplama");
            System.out.println("6: Faktöriyel Hesaplama");
            System.out.println("7: Mod Alma");
            System.out.println("8: Dikdörtgen Alan ve Çevre Hesabı");
            System.out.println("9: Çıkış");
            System.out.print("Seçiminiz: ");

            int seçim = scanner.nextInt();

            if (seçim == 9) {
                break; // Döngüden çık
            }

            switch (seçim) {
                case 1:
                    System.out.print("İki sayı girin: ");
                    double a1 = scanner.nextDouble();
                    double b1 = scanner.nextDouble();
                    System.out.println("Sonuç: " + toplama(a1, b1));
                    break;
                case 2:
                    System.out.print("İki sayı girin: ");
                    double a2 = scanner.nextDouble();
                    double b2 = scanner.nextDouble();
                    System.out.println("Sonuç: " + çıkarma(a2, b2));
                    break;
                case 3:
                    System.out.print("İki sayı girin: ");
                    double a3 = scanner.nextDouble();
                    double b3 = scanner.nextDouble();
                    System.out.println("Sonuç: " + çarpma(a3, b3));
                    break;
                case 4:
                    System.out.print("İki sayı girin: ");
                    double a4 = scanner.nextDouble();
                    double b4 = scanner.nextDouble();
                    System.out.println("Sonuç: " + bölme(a4, b4));
                    break;
                case 5:
                    System.out.print("Taban ve üs girin: ");
                    double taban = scanner.nextDouble();
                    double üs = scanner.nextDouble();
                    System.out.println("Sonuç: " + üsHesaplama(taban, üs));
                    break;
                case 6:
                    System.out.print("Bir sayı girin: ");
                    int n = scanner.nextInt();
                    long faktoriyelSonuç = faktoriyel(n);
                    if (faktoriyelSonuç != -1) {
                        System.out.println("Sonuç: " + faktoriyelSonuç);
                    }
                    break;
                case 7:
                    System.out.print("İki sayı girin: ");
                    double a7 = scanner.nextDouble();
                    double b7 = scanner.nextDouble();
                    System.out.println("Sonuç: " + modAlma(a7, b7));
                    break;
                case 8:
                    System.out.print("Dikdörtgenin uzunluğunu ve genişliğini girin: ");
                    double uzunluk = scanner.nextDouble();
                    double genişlik = scanner.nextDouble();
                    dikdörtgenAlanVeÇevre(uzunluk, genişlik);
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar seçin.");
            }
        }

        // Scanner'ı kapat
        scanner.close();
        System.out.println("Hesap makinesi kapatıldı.");
    }
}
