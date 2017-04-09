public class Animal {
	String nama;
	String jenis;
	String warna;
	String kaki;
		public void bergerak(){
			this.kaki = "berjalan";
			System.out.println("Animal"+this.nama+"berjalan");
		}
		public void makan(){
			this.kaki = "makan";
			System.out.println("Animal"+this.nama+"makan");
	}
}