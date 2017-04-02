import java.util.Scanner;
public class Animal {
	Scanner Input = new Scanner(System.in){
		String jenis;
		String bergerak;
		String makan;
		int kaki;

		public void jenis(String jenis){
			System.out.println("jenis: " +jenis);
			jenis = Input.next();
		}
		public void bergerak(){
			System.out.println("Cara bergerak : ");
			bergerak = Input.next();
		}
		public void makan(){
			System.out.println("Cara makan : ");
			makan = Input.next();  
		}
		public void kaki(){
			System.out.println("Jumlah kaki :");
			kaki = Input.nextInt();
			}
		public static void main(String[] args) {
	
		Animal = new animal();
		System.out.println();	
	}
	}
}