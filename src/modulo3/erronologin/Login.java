package erronologin;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        try {
            System.out.print("Digite o seu e-mail ");
            String email = new Scanner(System.in).nextLine();
    
            System.out.print("Digite a sua senha: ");
            String senha = new Scanner(System.in).nextLine(); 

            if (senha.length() < 8) {
                throw new SenhaInvalidaException("A sua senha não pode ser menor que 8 caracteres.");
            }
            
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Programa encerrado.");
        }

    }
}
