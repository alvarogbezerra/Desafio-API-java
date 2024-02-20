package erronologin;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws SenhaInvalidaException {
        try {
            System.out.print("Digite o seu e-mail ");
            String email = new Scanner(System.in).nextLine();
    
            System.out.print("Digite a sua senha: ");
            String senha = new Scanner(System.in).nextLine();    
        } finally {
            System.out.println("Programa encerrado.");
        }



    }
}
