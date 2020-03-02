import java.util.Scanner;
public class maquinaVenda {

	public static void main(String[] args) {
		String coin;
		int total=0,dCoin=0;
		Scanner s = new Scanner(System.in);
		
		while(total<=45) {
		System.out.println("Insira o valor de moeda: ");
		coin = s.nextLine();
		dCoin = Integer.parseInt(coin);
		
		if(dCoin==25||dCoin ==10) {
			total+=dCoin;
			if(total >=45) {
				System.out.println("Coca cola");
				System.out.println("O valor perdido foi de "+(total-45));
			}
		}else {
			System.out.println("Apenas valores de 0.25 e 0.10 são aceitos");
		}
		
		

		}

	}
}
