import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		calculadora calculadora = new calculadora();
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao = -1;

		
		double N1, N2;
		while (true) {
			System.out.print("Digite uma opção (1-soma, 2-subtracao, 3-multiplicacao, 4-divisao, 5-exponenciação, 6-raiz, 7-teto, 8-piso, 0-sair): ");
			opcao = scanner.nextInt();
			
			if(opcao == 0)
				break;

        if(opcao >8)
        break;
        
		
			switch (opcao) {
			case 1:{
				System.out.print("Digite o primeiro numero: ");
			N1 = scanner.nextDouble();
			System.out.print("Digite o segundo numero: ");
			N2 = scanner.nextDouble();

				System.out.println(calculadora.soma(N1, N2));
				break;
			}
			case 2:{
				System.out.print("Digite o primeiro numero: ");
			N1 = scanner.nextDouble();
			System.out.print("Digite o segundo numero: ");
			N2 = scanner.nextDouble();

				System.out.println(calculadora.sub(N1, N2));
				break;
			}
			case 3:{
				System.out.print("Digite o primeiro numero: ");
			N1 = scanner.nextDouble();
			System.out.print("Digite o segundo numero: ");
			N2 = scanner.nextDouble();

				System.out.println(calculadora.multi(N1, N2));
				break;
			}
			case 4:{
				System.out.print("Digite o primeiro numero: ");
			N1 = scanner.nextDouble();
			System.out.print("Digite o segundo numero: ");
			N2 = scanner.nextDouble();

				System.out.println(calculadora.div(N1, N2));
				break;
			}
      case 5:{
				System.out.print("Digite o primeiro numero: ");
			N1 = scanner.nextDouble();
			System.out.print("Digite o segundo numero: ");
			N2 = scanner.nextDouble();

        System.out.println(calculadora.expo(N1, N2));
        break;
      }
      case 6:{
				System.out.print("Digite o numero: ");
			N1 = scanner.nextDouble();
				
        System.out.println(calculadora.raiz(N1));
        break;
      }
      case 7:{
				System.out.print("Digite o numero: ");
			N1 = scanner.nextDouble();
				
        System.out.println(calculadora.teto(N1));
        break;
      }
      case 8:{
				System.out.print("Digite o numero: ");
			N1 = scanner.nextDouble();

        System.out.println(calculadora.piso(N1));
        break;
      }
      
			}
		}
		
		scanner.close();
	}

}
