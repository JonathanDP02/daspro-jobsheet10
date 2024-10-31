import java.util.Scanner;

public class searchNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//...................deklarasi..................//

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int banyakNilai = sc.nextInt();

        int[] arrNilai = new int[banyakNilai];
        int key, hasil = 0;

//..................perulangan................//

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+ ": ");
            arrNilai[i]= sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key==arrNilai[i]) {
                System.out.println();
                System.out.println("Nilai yang dicari ketemu, " +key+ " Merupakan nilai mahasiswa ke-" +(hasil+1));
                break;
            }else{
                System.out.println();
                System.out.println("Nilai yang dicari tidak ditemukan!");
                break;
            }
        }
    }
}
