import java.util.Scanner;

public class Nomor1{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double honorLembur = 0;
        int jamLembur = 0;
        jamLembur = input.nextInt();

        if(jamLembur <= 16 ){
            honorLembur = 10000 * jamLembur;
        }
        else if (jamLembur > 16) {
            honorLembur = (160000) + (15000 * (jamLembur - 16));
        } 
        else {
            System.out.println("input tidak valid");
        }
        System.out.println("Total jam lembur : " + jamLembur);
        System.out.println("Honor Lembur : " + honorLembur);

        //no 2

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
