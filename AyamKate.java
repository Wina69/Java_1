public class AyamKate implements Hewan1 {
	public void gerak(){
		System.out.println("Ayam Kate bisa bergerak");
	}
	public void makan(){
		System.out.println("Ayam Kate bisa makan");
	}
	public void tidur(){
		System.out.println("Ayam Kate tidur di malam hari");
	}


	public static void main(String[] args) {
		 
		 AyamKate aym = new AyamKate();
		 aym.gerak();
		 aym.makan();
		 aym.tidur();
	}
}