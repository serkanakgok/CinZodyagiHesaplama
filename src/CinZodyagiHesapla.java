import java.util.Scanner;

public class CinZodyagiHesapla {
    public static void main(String[] args) {
        int year;

        System.out.print("Doğum yılınızı giriniz :");
        Scanner data = new Scanner(System.in);
        year = data.nextInt();

        int zodi = year % 12;
        switch (zodi) {
            case 0:
                System.out.println();
                System.out.println("Zodyağınız :Maymun");
                break;
            case 1:
                System.out.println();
                System.out.println("Zodyağınız :Horoz");
                break;
            case 2:
                System.out.println();
                System.out.println("Zodyağınız :Köpek");
                break;
            case 3:
                System.out.println();
                System.out.println("Zodyağınız :Domuz");
                break;
            case 4:
                System.out.println();
                System.out.println("Zodyağınız :Fare");
                break;
            case 5:
                System.out.println();
                System.out.println("Zodyağınız :Öküz");
                break;
            case 6:
                System.out.println();
                System.out.println("Zodyağınız :Kaplan");
                break;
            case 7:
                System.out.println();
                System.out.println("Zodyağınız :Tavşan");
                break;
            case 8:
                System.out.println();
                System.out.println("Zodyağınız :Ejderha");
                break;
            case 9:
                System.out.println();
                System.out.println("Zodyağınız :Yılan");
                break;
            case 10:
                System.out.println();
                System.out.println("Zodyağınız :At");
                break;
            case 11:
                System.out.println();
                System.out.println("Zodyağınız :Koyun");
                break;
        }
    }
}