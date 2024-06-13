 import java.util.Scanner;

public class Divisors {

    public static void main(String args[]) {

        // Criando um objeto Scanner para receber a entrada do usuário
        Scanner console = new Scanner(System.in);
        
        // Solicitando ao usuário para inserir um número
        System.out.print("Enter the number: ");
        int num = console.nextInt();
        
        // Exibindo a mensagem inicial
        System.out.print("Divisors of " + num + " = ");

        // Loop para encontrar os divisores do número inserido
        for (int i = 1; i < num; i++) {
            // Verifica se o número é um divisor de 'num'
            if (num % i != 0); }
                // Se não for um divisor, continua para a próxima it…
    }
}