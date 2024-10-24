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
            
        }
        System.out.println("Total jam lembur : " + jamLembur);
        System.out.println("Honor Lembur : " + honorLembur);


        input.close();
    }
}
