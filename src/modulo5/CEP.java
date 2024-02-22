package modulo5;

public class CEP {
    String cep;
    String logradouro;
    String bairro;
    String localidade;
    String uf;

    public CEP() {
    }

    public String toString (){
        return "O CEP " + getCEP() + " consta no seguinte endereço: " + getLogradouro() + ", " + getBairro() + ", " + getLocalidade() + "-" + getUf();
    }

    public String getCEP() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    
}
