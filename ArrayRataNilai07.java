import java.util.Scanner;

public class ArrayRataNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//...................deklarasi array.....................//

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        
        int [] nilaiMhs = new int[jumlahMhs];
        int jmlLulus = 0, jmlTidak = 0;
        double totalLulus = 0, totalTidak = 0, rata2Lulus, rata2Tidak;



//...................perulangan.........................//

        for (int i=0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+ " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i=0; i<nilaiMhs.length; i++){
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            }else{
                totalTidak += nilaiMhs[i];
                jmlTidak++;
            }
        }

//....................output...........................//

        rata2Lulus =  totalLulus / jmlLulus;
        rata2Tidak = totalTidak / jmlTidak;
        System.out.println("Rata-rata nilai lulus = "+rata2Lulus); 
        System.out.println("Rata-rata nilai tidak lulus = " + rata2Tidak);
        
    }
}
