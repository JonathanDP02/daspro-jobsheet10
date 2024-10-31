public class searchNilai07 {
    public static void main(String[] args) {
        
//...................deklarasi..................//

        int[] arrNilai = {80,85,78,96,90,82,86};
        int key = 90, hasil = 0;

//....................perulangan................//

        for (int i = 0; i < arrNilai.length; i++){
            if (key==arrNilai[i]) {
                hasil = i;
                break;
            }
        }

//...................output...................//

        System.out.println();
        System.out.println("Nilai "+key+" ketemu di indeks ke-" +hasil);
        System.out.println();
    }
}
