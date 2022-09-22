package prak4_tugaspbo3_ara;
import java.util.Scanner;
public class Prak4_TugasPbo3_Ara {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int [] myNum = new int[n];
        int hasil = 0;
        
        for(int i = 0; i < myNum.length; i++){
            myNum[i] = input.nextInt();
            hasil += myNum[i]; 
        }
        System.out.print(hasil);
    }
}
