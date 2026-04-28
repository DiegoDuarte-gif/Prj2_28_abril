//Diego Ferreira Duarte
// RA: 1261933438
import java.util.Scanner;

public class App {
    public static int somarArray(int[] lista) {
        int soma = 0; 
        for (int i = 0; i < lista.length; i++) {
            soma = soma + lista[i];
        }
        return soma;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os 5 números inteiros separando apenas por espaços: ");
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }
        int resultadoSoma = somarArray(numeros);
        System.out.println("Soma: " + resultadoSoma);
        scanner.close();
    }
}