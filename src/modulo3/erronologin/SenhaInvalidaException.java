package erronologin;

public class SenhaInvalidaException extends Exception {
    public String mensagem;

    public SenhaInvalidaException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }  
}
