import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nama driver : ");
        String driver = input.next();

        System.out.println("Masukan lama trip : ");
        int km = input.nextInt();

        System.out.println("Masukan Input lagi? : ");
        String inputLagi = input.next();

        for (int i = 0; i <= 1; i++) {
            switch (inputLagi) {
                case "y":

                    System.out.println("Masukan nama driver : ");
                    driver = input.next();

                    System.out.println("Masukan lama trip : ");
                    km = input.nextInt();

                    System.out.println("Masukan Input lagi? : ");
                    inputLagi = input.next();
                    break;

                default:
                    break;
            }
        }

        int totalKm =+ km;
        System.out.println("Total KM : " + totalKm);
        double totalOmset = km * 13000;
        System.out.print("Total Omset : " + totalOmset);

        input.close();
    }
}
