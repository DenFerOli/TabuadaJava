import java.util.Scanner;

public class java {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num, soma;
		
		System.out.println("TABUADA\n");
		System.out.println("Digite um numero de 1 a 10:");
		num = sc.nextInt();
		
		if(num >= 1 && num <= 10) {
			for(int i = 0; i <= 10; i++) {
				soma = num * i;
				System.out.printf("%d x %d = %d\n", num, i, soma);
			}
		} else {
			System.out.println("Valor Inválido!");
		}
		
		sc.close();

	}
}
