public class HarimauAsia {

 public static void main(String[] args) {

		Harimau kucing = new Harimau();
		kucing.nama = "Harimau Sumatra";
		kucing.jenis = "Karnivora";
		kucing.warna = "Coklat";
		System.out.println("Hewan "+kucing.nama +" jenis "+kucing.jenis+ " berwarna " +kucing.warna);
		kucing.makan();
		kucing.kaki = "berjumlah_empat";
		kucing.berjalan();

		Harimau macan = new Harimau();
		macan.nama = "Macan_Tutul";
		macan.jenis = "Karnivora";
		macan.warna = "Coklat hitam polkadot";
		System.out.println("Hewan "+macan.nama +" jenis "+macan.jenis+ " berwarna " +macan.warna);
		macan.makan();
		macan.kaki = "berjumlah_empat";
		macan.berjalan();
	}
}