import java.util.Scanner;

public class ArrayRataNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//...................deklarasi array.....................//

        int [] nilaiMhs = new int[10];
        double total = 0, rata2;

//...................perulangan.........................//

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai Mahasiswa ke-" +(i+1)+" : ");
            nilaiMhs [i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++){
            total += nilaiMhs[i];
        }

//....................output...........................//

        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2); 
        
    }
}
