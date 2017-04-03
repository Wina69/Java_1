import java.util.Scanner;

public class IpMhs {

    	public static void main(String[] args){
		IpMhs ipmhs = new IpMhs();
		Scanner input = new Scanner(System.in);
		float IP;
		int jmlMhs=0, mhsLulus=0, mhsGagal=0;
		
		System.out.print("Masukkan IP : ");
		IP=input.nextFloat();
		while(IP!=-999){
			if(ipmhs.isWithinRange(IP, 0, 4) == 1){
				jmlMhs++;

				if(IP >= 2.7 && IP <= 4.0){
						mhsLulus++;
				} else{
						mhsGagal++;
				}
			}
			System.out.print("Masukkan IP : ");
			IP=input.nextFloat();
		}
		System.out.println("Jumlah Mahasiswa : "+jmlMhs);
		System.out.println("Mahasiswa yang lulus : "+mhsLulus);
		System.out.println("Mahasiswa tidak lulus : "+mhsGagal);
	}
	
	int isWithinRange(float x, int min, int max){
			if(x>=min && x<=max){
				return 1;
			} else {
				return 0;
			}
	}
}