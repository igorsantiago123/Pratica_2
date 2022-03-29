package pratica2;
import java.util.Scanner;
public class pratica2b {

static final int LIN = 50;
static final int COL = 50;
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int matriz[][] = new int[LIN][COL];
		int dp = 0;
		int x = 1;
		
		//leitura
		for(int i=0; i<LIN; i++) {
			for(int j=0; j<COL; j++) {
				matriz[i][j] = x;
				x+=2;
			}
		}
		
		//apresentacao
		for(int i=0; i<LIN; i++) {
			for(int j=0; j<COL; j++) {
				System.out.print("["+matriz[i][j]+"]");
			}
			System.out.println("\n");
		}
		
		//diagonal principal
				for(int i=0; i<LIN; i++) {
					for(int j=0; j<COL; j++) {
						if(i==j) {
							dp = dp + matriz[i][j];
						}
					}
					
				}
		
		System.out.println("O resultado da diagonal principal é: " + dp);

	}


}