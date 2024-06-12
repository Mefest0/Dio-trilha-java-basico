
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner.
        Scanner scanner = new Scanner(System.in);
        //Exibir as mensagens para o nosso usuário.
        System.out.println("Por favor, digite o numero da Agencia:");
        int agencia = scanner.nextInt();
        
        System.out.println("Por favor, digite o Nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Numero da Conta:");
        String numeroConta = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo:");
        double saldo = scanner.nextDouble();

        //Obter pela scanner os valores digitados no terminal.
        //Exibir a mensagagem da conta criada.
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponivel para saque.");

        scanner.close();
    }
}
