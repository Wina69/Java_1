import java.util.Scanner;

public class InputOutput4{
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		String nama;
		char jeniskelamin;
		int tinggibadan;
		boolean menikah;

	System.out.print("Masukkan Nama : ");
	nama = Input.next();

	System.out.print ("Masukkan jenis kelamin : ");
	jeniskelamin = Input.next().charAt(0);

	System.out.print("Masukkan Tinggi Badan : ");
	tinggibadan = Input.nextInt();

	System.out.print("Masukkan Status Menikah : ");
	menikah = Input.nextBoolean();
	menikah = true;
	if (menikah) {
		System.out.println("menikah");
	}
	if (!menikah) {
		System.out.println("belum menikah");
	}
	}
}