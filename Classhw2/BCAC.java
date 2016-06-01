package Classhw2;

public class BCAC {

	public static void main(String[] args) {
		
		
		for(int j=-5; j<=5; j++)
		{
			if(j<0)
			{
				if(-j==1){
					System.out.println("Century "+ -j+" BC "+ -j +"-"+(-j*100-1));
				}
				else{
					System.out.println("Century "+ -j+" BC "+ -j +"-"+(-j*100-1));
				}
				}
			else{
				if(j==0){
					System.out.print(" ");
					
				}
				else if(j==1){
					System.out.println("Century "+ j + " AD "+j+" - "+(j*100-1));
				}
				else{
					System.out.println("Century "+ j + " AD "+(j-1)*100+" - "+(j*100-1));
				}
					
				}
			}		
	}
}



