package contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nomeCliente = scanner.next();
		System.out.println("Olá " + nomeCliente + "! Por favor, digite o número da agência: ");
		String agencia = scanner.next();
		System.out.println("Informe o seu número de registro: ");
		int numero = scanner.nextInt();
		System.out.println("Informe o seu saldo: ");
		double saldo = scanner.nextDouble();
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
		+ ", conta "+ numero +" e seu saldo de R$" + saldo + " já está disponível para saque.");
		scanner.close();
		
		

	}

}
