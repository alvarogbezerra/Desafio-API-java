package trycatchbasico;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        try {
            System.out.println("Digite o primeiro numero: ");
            Scanner entrada1 = new Scanner(System.in);
            String valorConvertido1 = entrada1.nextLine();

            System.out.println("Digite o segundo numero: ");
            Scanner entrada2 = new Scanner(System.in);
            String valorConvertido2 = entrada2.nextLine();

            int numero1 = Integer.parseInt(valorConvertido1);
            int numero2 = Integer.parseInt(valorConvertido2);

            int resultado = numero1/numero2;

            System.out.println("O resultado da divisão é: " + resultado);
            
        } catch (Exception e) {
            System.out.println("Não existe divisão por zero! ");
        } finally {
            System.out.println("Programa finalizado.");
    }
}
}
