//Este trecho importa a classe Scanner do pacote java.util, que permite a leitura de entrada do usuário.
import java.util.Scanner;

//Define uma classe chamada Calculator.
public class Calculadora {

//Declara o método principal (main) que será executado quando o programa for iniciado.
    public static void main(String[] args) {

//Cria um objeto Scanner para ler a entrada do usuário a partir do console.
        Scanner scanner = new Scanner(System.in);

//Define uma variável booleana para controlar se o usuário deseja continuar calculando ou não.
        boolean continueCalculating = true;

//Inicia um loop while que continuará executando enquanto continueCalculating for true.
        while (continueCalculating) {

//Solicita ao usuário que digite a operação matemática desejada e lê o primeiro caractere digitado.
            System.out.println("Digite a operação que deseja realizar: (+, -, *, /)");
            char operation = scanner.next().charAt(0);

//Solicita ao usuário que digite o primeiro número da operação e lê o número digitado como um double.
            System.out.println("Digite o primeiro número:");
            double num1 = scanner.nextDouble();

//Solicita ao usuário que digite o segundo número da operação e lê o número digitado como um double.
            System.out.println("Digite o segundo número:");
            double num2 = scanner.nextDouble();

//Inicializa a variável result como 0.
            double result = 0;

//Executa uma operação matemática com base no caractere digitado pelo usuário. Se o caractere for inválido, exibe uma mensagem de erro e continua para a próxima iteração do loop.
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Operação inválida. Tente novamente.");
                    continue;
            }

//Exibe o resultado da operação matemática.
            System.out.println("O resultado é: " + result);

//Pergunta ao usuário se ele deseja realizar outra operação. Se a resposta não for 's' ou 'S', define continueCalculating como false para sair do loop.
            System.out.println("Deseja realizar outra operação? (s/n)");
            char anotherOperation = scanner.next().charAt(0);
            if (anotherOperation != 's' && anotherOperation != 'S') {
                continueCalculating = false;
            }
        }

//Exibe uma mensagem de agradecimento após sair do loop.
        System.out.println("Obrigado por usar a calculadora!");

//Fecha o objeto Scanner para liberar os recursos associados à entrada do usuário.
        scanner.close();
    }
}