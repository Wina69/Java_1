public class Mahasiswa {
public String nama;

public void kuliah(){
	System.out.println("kuliah");
}
	public static void main(String[] args) {
		Mahasiswa rendi = new Mahasiswa ();

		rendi.nama = "Rendi Firmansyah";
		rendi.kuliah();
}
}