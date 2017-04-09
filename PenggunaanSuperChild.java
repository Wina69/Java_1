public class PenggunaanSuperChild extends PenggunaanSuper {
	int num=10;
	public void tampilkan(){
		System.out.println("Ini tampilan dari Sub Class");
	}
	public void PenggunaanSuper(){
		tampilkan();
		Super.tampilkan();
		System.out.println("Nilai variabel num pada sub class:" +num);
		System.out.println("Nilai variabel num pada super class:" +Super.num);
	}
	public static void main(String[] args) {
		PenggunaanSuperChild  obj = new PenggunaanSuperChild();
		obj.penggunaanSuper();

	}
}